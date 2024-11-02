import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

interface SignupData {
  name: string;
  email: string;
  phoneno: string;
  type: string;  // "user" or "event organizer"
  password: string;
  repeatPassword: string;
}

@Component({
  selector: 'app-sign-up',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent {
  signupData: SignupData = {
    name: '',
    email: '',
    phoneno: '',
    type: '',
    password: '',
    repeatPassword: ''
  };

  constructor(private http: HttpClient) {}

  register() {
    // Check if all required fields are filled and passwords match
    if (this.signupData.name && this.signupData.email && this.signupData.phoneno && this.signupData.type && this.signupData.password && this.signupData.repeatPassword) {
      if (this.signupData.password !== this.signupData.repeatPassword) {
        alert("Passwords do not match!");
        return;
      }

      // Prepare data to be sent to the backend (excluding repeatPassword)
      const bodyData = {
        name: this.signupData.name,
        email: this.signupData.email,
        phoneno: this.signupData.phoneno,
        type: this.signupData.type,
        password: this.signupData.password
      };

      console.log('Request Body:', bodyData);

      // Send the data to the backend endpoint
      this.http.post('http://localhost:8081/api/sign-up', bodyData)
        .subscribe({
          next: resultData => {
            console.log('Response:', resultData);
            alert('Registered Successfully');  
          },
          error: error => {
            console.error('Error:', error); 
            alert('Failed to register');  
          },
          complete: () => {
            console.log('Request complete');  
          }
        });
    } else {
      alert('Please fill out all fields.');
    }
  }
}

