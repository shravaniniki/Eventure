import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { AuthService } from '../../../auth/services/auth.service';

@Component({
  selector: 'app-organizer-profile',
  standalone: true,
  imports: [],
  templateUrl: './organizer-profile.component.html',
  styleUrl: './organizer-profile.component.css'
})
export class OrganizerProfileComponent {
  user$: Observable<any | null> = this.authService.loggedInUser$; // Use observable to get the user object
  userName: string = '';
  userEmail: string = '';
  userPhone: string = ''; 
  userType: string = '';// Add properties for phone number

  constructor(private authService: AuthService) { }

  ngOnInit(): void {
    this.user$.subscribe(user => {
      if (user) {
        this.userName = user.name || ''; // Assuming your user object has a 'name' property; handle null/undefined
        this.userEmail = user.email || ''; // Assuming your user object has an 'email' property
        this.userPhone = user.phoneNo || '';
        this.userType = user.userType || ''; // Assuming your user object has a 'phone' property; handle null/undefined
      }
    });
  }
}
