import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../../services/auth.service';


@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  email: string = '';
  password: string = '';

  constructor(private router: Router, private authService: AuthService) {}

  onLogin() {
    // Hardcoded login credentials
    const hardcodedEmailUser = "aaa";
    const hardcodedPasswordUser = "a";
    const hardcodedEmailOrganizer = "bbb";
    const hardcodedPasswordOrganizer = "b";

    if ((this.email === hardcodedEmailUser && this.password === hardcodedPasswordUser) ||
        (this.email === hardcodedEmailOrganizer && this.password === hardcodedPasswordOrganizer)) {
      
      this.authService.setLoggedInEmail(this.email);  // Set the email in AuthService
      alert('Login successful');
      this.router.navigate(['/']);  // Navigate to homepage or other routes as needed
    } else {
      alert('Invalid credentials');
    }
  }
}
