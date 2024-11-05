// import { Component } from '@angular/core';
// import { FormsModule } from '@angular/forms';
// import { Router } from '@angular/router';
// import { AuthService } from '../../services/auth.service';

// @Component({
//   selector: 'app-login',
//   standalone: true,
//   imports: [FormsModule],
//   templateUrl: './login.component.html',
//   styleUrls: ['./login.component.css'],
// })
// export class LoginComponent {
//   email: string = '';
//   password: string = '';

//   constructor(private router: Router, private authService: AuthService) {}

//   onLogin() {
//     // Hardcoded login credentials
//     const hardcodedEmailUser = 'aaa';
//     const hardcodedPasswordUser = 'a';
//     const hardcodedEmailOrganizer = 'bbb';
//     const hardcodedPasswordOrganizer = 'b';

//     if (
//       this.email === hardcodedEmailUser &&
//       this.password === hardcodedPasswordUser
//     ) {
//       this.authService.setLoggedInEmail(this.email); // Set the email in AuthService
//       alert('Login successful');
//       this.router.navigate(['/']); // Navigate to homepage or other routes as needed
//     } else if (
//       this.email === hardcodedEmailOrganizer &&
//       this.password === hardcodedPasswordOrganizer
//     ) {
//       this.authService.setLoggedInEmail(this.email); // Set the email in AuthService
//       alert('Login successful');
//       this.router.navigate(['/organizer']); // Navigate to homepage or other routes as needed
//     } else {
//       alert('Invalid credentials');
//     }
//   }
// }
import { Component } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { AuthService } from '../../services/auth.service';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule,CommonModule,ReactiveFormsModule],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent {
  loginForm: FormGroup;


  constructor(private http: HttpClient, private router: Router, private authService: AuthService) {
    this.loginForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', Validators.required),
    });
  }

  login() {
      if (this.loginForm.valid) {
        this.authService.login(this.loginForm.value).subscribe({
          next: (response) => {
            console.log('Login successful:', response);
            const userType = this.authService.getUserType(); //Get type from service
            this.router.navigate([userType === 'organizer' ? '/organizer' : '/']);
          },
          error: (error) => {
            console.error('Login error:', error);
            alert(error.message); // Display error message from the service
          }
        });
      }
    }
}