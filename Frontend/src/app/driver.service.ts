import { Injectable } from '@angular/core';
import { Driver } from './driver';
import { Observable, of } from 'rxjs';
import { MessageService } from './message.service';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class DriverService {



  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };
  private driverURL: string;
  private escuderiaURL: string;
  constructor(private messageService: MessageService, private http: HttpClient) {
    this.driverURL = '/api/pilotoes';
    this.escuderiaURL = '/api/escuderias';

  }
  //http://localhost:5504
  
  getEscuderiaPiloto(href): Observable<any> {
    console.log(href.slice(21,href.length))
    return this.http.get<any>(href.slice(21,href.length))
  }

  getEscuderias(): Observable<any> {
    return this.http.get<any>(this.escuderiaURL).pipe(
      catchError(this.handleError<any>('getEscuderias', []))
    );
  }
  getDrivers(): Observable<any> {
    return this.http.get<any>(this.driverURL).pipe(
      catchError(this.handleError<any>('getDrivers', []))
    );
  }

  // getDriver(id: number): Driver {
  //   this.getDrivers().subscribe(drivers => {
      
  //     drivers._embedded.pilotoes.forEach(element => {
  //       console.log(element.nombre)
  //      if (element.id == id) {
  //       return element
  //      }
  //    });

  //   });
  //   return null;
  // }
  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}
