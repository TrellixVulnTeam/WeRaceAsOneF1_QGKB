import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { Driver } from '../driver';

import { Escuderia } from '../escuderia';
import { DriverService } from '../driver.service';
import { DashboardComponent } from '../dashboard/dashboard.component';

@Component({
  selector: 'app-driver-detail',
  templateUrl: './driver-detail.component.html',
  styleUrls: ['./driver-detail.component.css']
})
export class DriverDetailComponent implements OnInit {
  @Input() driver?: any;
  @Input() escuderia?: any;

  constructor(
    private route: ActivatedRoute,
    private driverService: DriverService,
    private location: Location,
  ) {}

  ngOnInit(): void {
    this.getDriver();
  }
  
  getDriver(): void {
    
    // var id = Number(this.dashboard.getSelectedDriver)
    // console.log()
    // this.driver = this.driverService.getDriver(id)

  }

  goBack(): void {
    this.location.back();
  }
}