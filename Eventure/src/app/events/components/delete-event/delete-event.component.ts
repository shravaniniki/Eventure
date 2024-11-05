import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EventService } from '../../services/event.service';
import { IEvent } from '../../model/ievent.model';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-delete-event',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './delete-event.component.html',
  styles: [],
})
export class DeleteEventComponent implements OnInit {
  eventId: string | null = null;
  event: IEvent | null = null;

  constructor(
    private eventService: EventService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.route.paramMap.subscribe((params) => {
      this.eventId = params.get('id');
      if (this.eventId) {
        this.fetchEventData(this.eventId);
      }
    });
  }

  fetchEventData(eventId: string): void {
    this.eventService.getEventById(eventId).subscribe(
      (eventData: IEvent) => {
        this.event = eventData;
      },
      (error) => {
        console.error('Error fetching event data', error);
      }
    );
  }

  deleteEvent(event: Event): void {
    const confirmDelete = confirm(
      'Are you sure you want to delete this event?'
    );
    if (confirmDelete && this.eventId) {
      // Disable button to prevent multiple clicks
      const target = event.target as HTMLButtonElement;
      target.innerText = 'Deleting...';
      target.disabled = true;

      this.eventService.deleteEvent(this.eventId).subscribe(
        () => {
          alert('Event deleted successfully!');
          this.router.navigate(['/organizer']); // Redirect to events list
        },
        (error) => {
          console.error('Error deleting event', error);
          alert('There was an error deleting the event. Please try again.');
          target.innerText = 'Delete Event'; // Reset button text on error
          target.disabled = false; // Re-enable button
        }
      );
    }
  }
}
