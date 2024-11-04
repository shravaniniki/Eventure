import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormGroup, ReactiveFormsModule, FormControl, Validators } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { EventService } from '../events/services/event.service';

@Component({
  selector: 'app-user-settings',
  standalone: true,
  imports: [RouterModule, ReactiveFormsModule, CommonModule],
  templateUrl: './registration.component.html',
  styleUrl: './registration.component.css'
})
export class UserSettingsComponent {
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

  // Access the form element
  