import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Iuser } from '../../model/iuser.model';
@Injectable({
  providedIn: 'root',
})

export class UserService {
  private apiUrl = 'http://localhost:8081/api/register';

  constructor(private http: HttpClient) { }

  
  // 1. get the request from component
  getUsers(): Observable<Iuser[]> {
    // 2. send the request to the REST api
    // 2.1 What's the REST API URL? apiUrl
    // 2.2 What's the HTTP Method? GET
    // 2.3 What's the REST API Client Tool? HttpClient
    return this.http.get<Iuser[]>(this.apiUrl);
    // 3. get the response from the REST api
    // 4. return the response to the component
  }

   addUser(formData: any) {
    console.log(formData);

    // 2. send the data to the REST api
    // 2.1 What's the REST API URL? apiUrl
    // 2.2 What's the HTTP Method? POST
    // 2.3 What's the REST API Client Tool? HttpClient
    return this.http.post(this.apiUrl, formData);
  }
  getUserById(userId: string): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/${userId}`);
  }
  // updateEvent(userId: string, userData: User): Observable<Event> {
  //   return this.http.put<Event>(`${this.apiUrl}/${userId}`, userData);
  // }
}

