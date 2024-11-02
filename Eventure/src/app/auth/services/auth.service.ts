import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const BASIC_URL = "http://localhost:8081/Eventure";
@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  register(url: string,sigupRequestDTO: any): Observable<any>{
    console.log(sigupRequestDTO);
    console.log(url);
    return this.http.post(BASIC_URL +url, sigupRequestDTO);
  }
}
