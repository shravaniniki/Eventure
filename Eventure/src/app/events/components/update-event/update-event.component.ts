import { Component, OnInit } from '@angular/core';
import {
  FormBuilder,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';
import { EventService } from '../../services/event.service';
import { ActivatedRoute, Router } from '@angular/router';
import { IEvent } from '../../model/ievent.model';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-update-event',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './update-event.component.html',
  styles: [],
})
export class UpdateEventComponent implements OnInit {
  isUpdated: boolean = false;
  eventForm: FormGroup;
  eventId?: string; // Declaring a variable to dynamically update the event id


  constructor(
    private router: Router,
    private fb: FormBuilder,
    private eventService: EventService,
    private route: ActivatedRoute
  ) {
    this.eventForm = this.fb.group({
      name: ['', Validators.required],
      organizer: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern('^[0-9]{10}$')]],
      location: ['', Validators.required],
      date: ['', Validators.required],
      duration: ['', Validators.required],
      maxParticipants: ['', [Validators.required, Validators.min(1)]],
      mode: ['', Validators.required],
      description: ['', Validators.required],
    });
  }


  ngOnInit(): void {
    this.route.paramMap.subscribe((params) => {
      this.eventId = params.get('id')!;
      if (this.eventId) {
        this.fetchEventData(this.eventId);
      }
    });
  }


  fetchEventData(eventId: string): void {
    this.eventService.getEventById(eventId).subscribe(
      (eventData: IEvent) => {
        console.log('Fetched event data:', eventData);


        const mappedData = {
          name: eventData.name,
          organizer: eventData.organizer,
          email: eventData.email,
          phone: eventData.phone,
          location: eventData.location,
          date: eventData.e_date,
          duration: eventData.duration,
          maxParticipants: eventData.maxParticipants,
          mode: eventData.e_mode,
          description: eventData.description,
        };


        this.eventForm.patchValue(mappedData);
      },
      (error) => {
        console.error('Error fetching event data', error);
      }
    );
  }


  onSubmit(): void {
    console.log('Form Validity:', this.eventForm.valid);
    console.log('Form Controls:', this.eventForm.controls);
    if (this.eventForm.valid) {
      const eventData: IEvent = {
        ...this.eventForm.value,
        e_date: this.eventForm.value.date, // Ensure date is in correct format (yyyy-MM-dd)
        e_mode: this.eventForm.value.mode,
      };


      this.eventService.updateEvent(this.eventId!, eventData).subscribe(
        () => {
          console.log('Event updated successfully!');
          this.isUpdated = true;
          alert('Event updated successfully!');
          this.router.navigateByUrl("/list");

        },
        (error) => {
          console.error('Error updating event', error);
          alert('Error updating event. Please try again.');
        }
      );
    } else {
      console.error('Form is invalid');
      alert('Please fill in all required fields.');
    }
  }
}

