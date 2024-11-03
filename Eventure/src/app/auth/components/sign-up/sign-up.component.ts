import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AbstractControl, FormControl, FormGroup, FormsModule, ReactiveFormsModule, ValidationErrors, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-sign-up',
  standalone: true,
  imports: [FormsModule,CommonModule,ReactiveFormsModule, RouterModule],
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent {

  signupData!: FormGroup;
  errorMessage: any;
  successMessage: any;
  signupForm: any;
  mismatch: any;

  constructor(private router: Router, private http: HttpClient) { 
    this.signupData = new FormGroup({
      name: new FormControl('', Validators.required),
      email: new FormControl('', [Validators.required, Validators.email]),
      phoneNo: new FormControl('', [Validators.required, Validators.minLength(10), Validators.maxLength(10)]),
      type: new FormControl('', Validators.required),
      password: new FormControl('', Validators.required),
      confirmPassword: new FormControl('', Validators.required)
    }, { validators: this.passwordMatchValidator });
  }
  passwordMatchValidator(control: AbstractControl): ValidationErrors | null {
    const password = control.get('password')?.value;
    const confirmPassword = control.get('confirmPassword')?.value;
    return password === confirmPassword ? null : { mismatch: true };
  }

  signUpForm() {
    // Check if all required fields are filled and passwords match
    if (this.signupData.valid) {
      const bodyData = { ...this.signupData.value }; // Spread operator to create a copy
        // Prepare data to be sent to the backend (excluding repeatPassword)


      // Prepare data to be sent to the backend (excluding repeatPassword)

      console.log('Request Body:', bodyData);

      // Send the data to the backend endpoint
      this.http.post('http://localhost:8081/api/sign-up', bodyData)
        .subscribe({
          next: resultData => {
            console.log('Response:', resultData);
            this.successMessage = 'Registration successful!';
            this.errorMessage = '';
            this.router.navigateByUrl('/login');
          },
          error: error => {
            this.errorMessage = 'Registration failed: ' + (error.error.message || 'An unknown error occurred.');
            this.successMessage = '';
            console.error('Error:', error);

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

