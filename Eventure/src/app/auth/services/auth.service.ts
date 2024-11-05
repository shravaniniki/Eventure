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
  private loggedInUser = new BehaviorSubject<LoginResponse | null>(null); // Store the entire user object
  loggedInUser$ = this.loggedInUser.asObservable();
 loggedIn: boolean = false;

  // private loggedInEmail = new BehaviorSubject<string | null>(null); // Observable to track logged-in user's email
  // loggedInEmail$ = this.loggedInEmail.asObservable(); // Expose the observable

  constructor(private http: HttpClient) {}

  login(credentials: any): Observable<LoginResponse> {
    return this.http
      .post<LoginResponse>(`${BASIC_URL}/login`, credentials)
      .pipe(
        map((response: LoginResponse) => {
          console.log(response);
          this.loggedInUser.next(response);
          localStorage.setItem('loggedInUser', JSON.stringify(response)); //Store user data in localstorage
          return response;
        })
      );
  }

 
  logout() {
    this.loggedInUser.next(null);
    localStorage.removeItem('loggedInUser');
  }

  isLoggedIn(): boolean {
    return this.loggedInUser.value !== null;
  }

  getUserType(): string | null {
    return this.loggedInUser.value?.userType || null;
  }

  getUserName(): string | null {
    return this.loggedInUser.value?.name || null;
  }
  getPhoneNo(): string | null {
    return this.loggedInUser.value?.phoneNo || null;
  }
  private userEmail: string | null = null; // Store the user's email


  // This method should be called when the user logs in
  setUserEmail(email: string) {
    this.userEmail = email;
  }


  // This method retrieves the logged-in user's email
  getUserEmail(): string | null {
    return this.userEmail;
  }
  
  

}
