import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IEvent } from '../model/ievent.model';





@Injectable({
  providedIn: 'root',
})
export class EventService {
  private apiUrl = 'https://jsonplaceholder.typicode.com/users';
  constructor(private http: HttpClient) { }
  // 1. get the request from component
  getEvents(): Observable<IEvent[]> {
    console.log('Inside getEmployees');
    // 2. send the request to the REST api
    // 2.1 What's the REST API URL? apiUrl
    // 2.2 What's the HTTP Method? GET
    // 2.3 What's the REST API Client Tool? HttpClient
    return this.http.get<IEvent[]>(this.apiUrl);
    // 3. get the response from the REST api
    // 4. return the response to the component
  }
}