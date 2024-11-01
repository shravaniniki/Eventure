import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';  // Correct import

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']  // Corrected 'styleUrls' instead of 'styleUrl'
})
export class LoginComponent {
  email: string = '';
  password: string = '';

  constructor(private router: Router) {}

  onLogin() {
    // Hardcoded login credentials
    const hardcodedEmail = "abc";
    const hardcodedPassword = "a";

    // Check if entered credentials match the hardcoded ones
    if (this.email === hardcodedEmail && this.password === hardcodedPassword) {
      alert('Login successful');
      this.router.navigate(['/']); 
    } else {
      alert('Invalid credentials');
    }
  }
}

