import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import Tourist from './tourist';
@Injectable({
  providedIn: 'root'
})
export class TouristsService {
  
  private getURL = 'http://localhost:8081/tourist/get';
  private url = 'http://localhost:8081/tourist/save';
  constructor(private httpClient: HttpClient) { }
  getTouristList(): Observable<Tourist[]>{
    return this.httpClient.get<Tourist[]>(`${this.getURL}`);
  }
  createTouristList(tourist:Tourist): Observable<Object>{
    return this.httpClient.post<Tourist[]>(`${this.url}`, tourist);
  }
}
