import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, map, Observable } from 'rxjs';

const BASIC_URL = 'http://localhost:8081/api';
export interface LoginResponse {
  email: string;
  userType: string;
  name: string;
  phoneNo: string;
}

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  private loggedInUser = new BehaviorSubject<any | null>(null); // Store the entire user object
  loggedInUser$ = this.loggedInUser.asObservable();

  private loggedInEmail = new BehaviorSubject<string | null>(null); // Observable to track logged-in user's email
  loggedInEmail$ = this.loggedInEmail.asObservable(); // Expose the observable

  constructor(private http: HttpClient) {}

  login(credentials: any): Observable<LoginResponse> {
    return this.http
      .post<LoginResponse>(`${BASIC_URL}/login`, credentials)
      .pipe(
        map((response: LoginResponse) => {
          this.loggedInUser.next(response);
          this.setLoggedInEmail(response.email);
          return response;
        })
      );
  }

  logout() {
    this.loggedInUser.next(null); // Clear logged-in user data
    // You might add logic here to clear any stored tokens (if using JWT)
  }

  isLoggedIn(): boolean {
    return this.loggedInUser.value !== null; // Check if a user is logged in
  }

  getUserType(): string | null {
    return this.loggedInUser.value?.userType || null; //Safely access userType
  }

  // Function to set the email after a successful login
  setLoggedInEmail(email: string) {
    this.loggedInEmail.next(email);
  }

  // Function to clear email on logout
  clearLoggedInEmail() {
    this.loggedInEmail.next(null);
  }
}
