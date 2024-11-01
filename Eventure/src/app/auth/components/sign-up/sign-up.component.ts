import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent {
  name = '';
  email = '';
  password = '';
  phoneNo = '';

  constructor(private http: HttpClient, private router: Router) {}

  onSignUp() {
    const userData = {
      name: this.name,
      email: this.email,
      password: this.password,
      phoneno: this.phoneNo
    };

    this.http.post('http://localhost:8080/api/users/register', userData)
      .subscribe(
        response => {
          alert('Sign-up successful');
          this.router.navigate(['/login']);  // Redirect to login page upon successful sign-up
        },
        error => {
          alert('Sign-up failed');
        }
      );
  }
}
