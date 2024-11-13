import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormGroup, ReactiveFormsModule, FormControl, Validators } from '@angular/forms';
import { RouterModule, ActivatedRoute } from '@angular/router';
import { EventService } from '../events/services/event.service';
import { UserService } from '../users/services/user/user.service';

@Component({
  selector: 'app-user-settings',
  standalone: true,
  imports: [RouterModule, ReactiveFormsModule, CommonModule],
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class UserSettingsComponent implements OnInit {
  registrationForm: FormGroup;
  isSaved = false;
  isError = false;
  eventId: string | null = null; // Declare eventId as a class property

  constructor(
    private userService: UserService,
    private route: ActivatedRoute
  ) {
    // Initialize the registration form
    this.registrationForm = new FormGroup({
      name: new FormControl('', Validators.required),
      phone: new FormControl('', [Validators.required, Validators.pattern('[0-9]{10}')]),
      email: new FormControl('', [Validators.required, Validators.email]),
    });
  }

  ngOnInit(): void {
    // Retrieve the event_id from the route parameters when the component initializes
    this.eventId = this.route.snapshot.paramMap.get('eventId');
    console.log('Event ID:', this.eventId); // You can log to verify the eventId
  }

  handleSubmit() {
    const userData = {
      name: this.registrationForm.value.name,
      email: this.registrationForm.value.email,
      phoneNo: this.registrationForm.value.phone,
      eventId: Number(this.eventId),
    };
  
    console.log('Sending userData:', userData);  // To check the format
  
    this.userService.addUser(userData).subscribe(
      (response: any) => {
        if (response && response.message) {
          console.log('User registered successfully:', response);
          this.isSaved = true;
          this.isError = false;
          alert("Registration successful");
          this.registrationForm.reset(); // Reset the form after successful registration
        } else {
          console.error('Registration failed: Unexpected response', response);
          this.isError = true;
        }
      },
      (error) => {
        console.error('Registration failed:', error);
        this.isSaved = false;
        this.isError = true;
      }
    );
  }
  
}
