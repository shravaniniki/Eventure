import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import {
  FormGroup,
  ReactiveFormsModule,
  FormControl,
  Validators,
} from '@angular/forms';
import { RouterModule } from '@angular/router';
import { EventService } from '../../services/event.service';

@Component({
  selector: 'app-add-event',
  standalone: true,
  imports: [RouterModule, ReactiveFormsModule, CommonModule],
  templateUrl: './add-event.component.html',
  styles: ``,
})
export class AddEventComponent {
  addEventForm: FormGroup;
  isSaved = false;

  constructor(private eventServiceService: EventService) {
    this.addEventForm = new FormGroup({
      name: new FormControl('', Validators.required),
      phone: new FormControl('', [
        Validators.required,
        Validators.pattern('[0-9]{10}'),
      ]),
      email: new FormControl('', [Validators.required, Validators.email]),
      organizer: new FormControl('', Validators.required),
      location: new FormControl('', Validators.required),
      date: new FormControl('', [
        Validators.required,
        Validators.pattern(/^\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$/),
      ]),
      duration: new FormControl('', [
        Validators.required,
        Validators.pattern(/^([01]\d|2[0-3]):([0-5]\d)$/),
      ]),
      maxParticipants: new FormControl('', [
        Validators.required,
        Validators.min(1),
      ]),
      mode: new FormControl('', Validators.required),
      description: new FormControl('', Validators.required),
    });
  }

  handleSubmit() {
    const eventData = {
      ...this.addEventForm.value,
      e_date: this.addEventForm.value.date, // Rename for service to store in db
      e_mode: this.addEventForm.value.mode, // Rename for service to store in db
    };
    console.log('Event Data:', eventData); // Check the data before sending

    this.eventServiceService.addEvent(eventData).subscribe((response: any) => {
      console.log(response);
      this.isSaved = true;
      this.addEventForm.reset(); // Reset form on success
    });
  }
}
