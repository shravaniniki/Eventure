<<<<<<< HEAD
import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormGroup, ReactiveFormsModule, FormControl, Validators } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { EventService } from '../events/services/event.service';
@Component({
  selector: 'app-user-settings',
  standalone: true,
  imports: [ReactiveFormsModule,RouterModule,CommonModule],
=======
import { Component, ElementRef, ViewChild } from '@angular/core';

@Component({
  selector: 'app-registration',
>>>>>>> 23fd564496aba88f60afb98e7da120c607c7db27
  templateUrl: './registration.component.html',
})
export class UserSettingsComponent {
<<<<<<< HEAD
  registrationForm: FormGroup;
  isSaved = false;
  constructor(private eventServiceService: EventService) {
    this.registrationForm = new FormGroup({
      name: new FormControl('', Validators.required),
      phone: new FormControl('', [Validators.required, Validators.pattern("[0-9]{10}")]),
      email: new FormControl('', [Validators.required, Validators.email]),

    });
  }
  handleSubmit() {
   
//         const eventData = {
//             ...this.registrationForm.value,
//             e_date: this.registrationForm.value.date, // Rename for service if necessary
//             e_mode: this.registrationForm.value.mode  // Rename for service if necessary
//         };
//         console.log('Event Data:', eventData); // Check the data before sending

//         this.eventServiceService.addEvent(eventData)
//             .subscribe((response: any) => {
//                 console.log(response);
//                 this.isSaved = true;
//                 this.registrationForm.reset();//Reset form on success
//             });  
}
}

=======
  // Access the form element
  @ViewChild('registrationForm', { static: false }) registrationForm!: ElementRef;

  // Method to handle form submission
  onRegister() {
    alert("Event Registered"); // Display alert

    // Reset the form fields
    if (this.registrationForm) {
      this.registrationForm.nativeElement.reset();
    }
  }
}
>>>>>>> 23fd564496aba88f60afb98e7da120c607c7db27

