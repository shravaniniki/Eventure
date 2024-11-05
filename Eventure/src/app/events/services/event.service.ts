import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IEvent } from '../model/ievent.model';

@Injectable({
  providedIn: 'root',
})
export class EventService {
  private apiUrl = 'http://localhost:8081/api/events';

  constructor(private http: HttpClient) { }

  
  // 1. get the request from component
  getEvents(): Observable<IEvent[]> {
    // 2. send the request to the REST api
    // 2.1 What's the REST API URL? apiUrl
    // 2.2 What's the HTTP Method? GET
    // 2.3 What's the REST API Client Tool? HttpClient
    return this.http.get<IEvent[]>(this.apiUrl);
    // 3. get the response from the REST api
    // 4. return the response to the component
  }

   addEvent(formData: any) {
    console.log(formData);

    // 2. send the data to the REST api
    // 2.1 What's the REST API URL? apiUrl
    // 2.2 What's the HTTP Method? POST
    // 2.3 What's the REST API Client Tool? HttpClient
    return this.http.post(this.apiUrl, formData);
  }
  //fetch the event detail by using id.
  getEventById(eventId: string): Observable<any> {
    // 2. send the data to the REST api
    // 2.1 What's the REST API URL? apiUrl
    // 2.2 What's the HTTP Method?GET
    // 2.3 What's the REST API Client Tool? HttpClient
    return this.http.get<any>(`${this.apiUrl}/${eventId}`);
  }
  updateEvent(eventId: string, eventData: Event): Observable<Event> {
    // 2. send the data to the REST api
    // 2.1 What's the REST API URL? apiUrl
    // 2.2 What's the HTTP Method? PUT
    // 2.3 What's the REST API Client Tool? HttpClient
    return this.http.put<Event>(`${this.apiUrl}/${eventId}`, eventData);
  }

  deleteEvent(eventId: string): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${eventId}`);
  }

 
}