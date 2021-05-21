import { Component, OnInit } from '@angular/core';

import { Driver } from '../driver';
import { Escuderia } from '../escuderia';
import { DriverService } from '../driver.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  drivers: Driver[] = [];
  escuderias: Escuderia[] = [];

  selectedDriver?: any;
  selectedDriverEscuderia?: any;

  constructor(private driverService: DriverService) { }

  ngOnInit(): void {
    this.getDrivers();
    this.getEscuderias();
  }

  
  pilotoSeleccionado(driver){
    this.selectedDriver = driver
    this.driverService.getEscuderiaPiloto(driver._links.escuderia.href).subscribe(escuderia=>{

      this.selectedDriverEscuderia = escuderia

    })
  }

  getDrivers(): void {
    this.driverService.getDrivers().subscribe(drivers => {
      
      this.drivers=drivers._embedded.pilotoes

      

    });
  }

  getEscuderias(): void {
    this.driverService.getEscuderias().subscribe(escuderias => {
      this.escuderias=escuderias._embedded.escuderias
    });
  }

}
