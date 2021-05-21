import { Component, OnInit } from '@angular/core';

import { Driver } from '../driver';
import { Escuderia } from '../escuderia';
import { DriverService } from '../driver.service';
import { MessageService } from '../message.service';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-escuderias',
  templateUrl: './escuderias.component.html',
  styleUrls: ['./escuderias.component.css']
})
export class EscuderiasComponent implements OnInit {

  escuderias: Escuderia[] = [];

  constructor(private driverService: DriverService, private messageService: MessageService, private htpp :HttpClient) { }

  ngOnInit(): void {
  }


  getEscuderias(): void {
    this.driverService.getEscuderias().subscribe(escuderias => {
        
  
    this.escuderias = escuderias._embedded.escuderias
        
        
  
    });
  }
  

}
