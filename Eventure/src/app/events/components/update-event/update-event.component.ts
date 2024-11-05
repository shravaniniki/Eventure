import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { EventService } from '../../services/event.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-update-event',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './update-event.component.html',
  styles: ``
})
export class UpdateEventComponent implements OnInit {
  eventForm: FormGroup;
  eventId?: string; // Declaring a variable to dynamically update the event id
// using activated route to fetch the event id from the url
  constructor(
    private fb: FormBuilder,
    private eventService: EventService,
    private route: ActivatedRoute // Inject ActivatedRoute
  ) {
    this.eventForm = this.fb.group({
      name: [''],
      organizer: [''],
      email: [''],
      phone: [''],
      location: [''],
      date: [''],
      duration: [''],
      maxParticipants: [''],
      mode: [''],
      description: ['']
    });
  }

  ngOnInit(): void {
    // Get the eventId from route parameters
    //paramMap contains all the route parameters associated with the current route.
    this.route.paramMap.subscribe(params => {
      this.eventId = params.get('id')!; // Retrieve eventId . Non null assertion
      if (this.eventId) {
        this.fetchEventData(this.eventId); // Fetch data if eventId exists
      }
    });
  }

  fetchEventData(eventId: string): void {
    this.eventService.getEventById(eventId).subscribe(
      (eventData: Event) => {
        this.eventForm.patchValue(eventData); // Prefill the form
      },
      error => {
        console.error('Error fetching event data', error);
      }
    );
  }


  onSubmit(): void {
    if (this.eventForm.valid) {
      // Call the update method from the service
      this.eventService.updateEvent(this.eventId!, this.eventForm.value).subscribe(
        () => {
          console.log('Event updated successfully!');
          // show a success message
        },
        error => {
          console.error('Error updating event', error);
          // Show an error message to the user
        }
      );
    } else {
      console.error('Form is invalid');
      //showing error messages
    }
  }


}


