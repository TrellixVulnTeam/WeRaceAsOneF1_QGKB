import { Component, OnInit } from '@angular/core';

import { Driver } from '../driver';
import { Escuderia } from '../escuderia';
import { DriverService } from '../driver.service';
import { MessageService } from '../message.service';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-drivers',
  templateUrl: './drivers.component.html',
  styleUrls: ['./drivers.component.css']
})
export class DriversComponent implements OnInit {

  drivers: Driver[] = [];
  escuderias: Escuderia[] = [];

  selectedDriver?: Driver;


  constructor(private driverService: DriverService, private messageService: MessageService, private htpp :HttpClient) { }


  onSelect(driver: Driver): void {
    this.selectedDriver = driver;
    // this.messageService.add(`HeroesComponent: Selected hero id=${driver.id}`);
  }

  ngOnInit() {
    this.getDrivers();
    this.getEscuderias();
  }


  getDrivers(): void {
    this.driverService.getDrivers().subscribe(drivers => {
      
      this.drivers=drivers._embedded.pilotoes


    });
  }

  getDriver(id: number): Driver {
    this.driverService.getDrivers().subscribe(drivers => {
      
      drivers._embedded.pilotoes.forEach(element => {
       if (element.id == id) {
        return element
       }
     });

    });
    return null;
  }

  getEscuderias(): void {
    this.driverService.getEscuderias().subscribe(escuderias => {
        
  
    this.escuderias = escuderias._embedded.escuderias
        
        

  
    });
  }
}
