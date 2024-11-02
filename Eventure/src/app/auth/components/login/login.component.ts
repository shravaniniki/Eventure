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
    const hardcodedEmailUser = "aaa";
    const hardcodedPasswordUser = "a";
    const hardcodedEmailOrganizer = "bbb";
    const hardcodedPasswordOrganizer = "b";

    // Check if entered credentials match the hardcoded ones
    if (this.email === hardcodedEmailUser && this.password === hardcodedPasswordUser) {
      alert('Login successful');
      this.router.navigate(['/']); 
    }
    else if (this.email === hardcodedEmailOrganizer && this.password === hardcodedPasswordOrganizer) {
      alert('Login successful');
      this.router.navigate(['/organizer']); 
    } else {
      alert('Invalid credentials');
    }
  }
}

