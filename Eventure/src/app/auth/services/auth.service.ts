import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';

const BASIC_URL = "http://localhost:8081/Eventure";
@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private loggedInEmail = new BehaviorSubject<string | null>(null);  // Observable to track logged-in user's email
  loggedInEmail$ = this.loggedInEmail.asObservable();  // Expose the observable

  // Function to set the email after a successful login
  setLoggedInEmail(email: string) {
    this.loggedInEmail.next(email);
  }

  // Function to clear email on logout
  clearLoggedInEmail() {
    this.loggedInEmail.next(null);
  }
}
