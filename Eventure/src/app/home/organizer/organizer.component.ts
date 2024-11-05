import { Component, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import { AuthService } from '../../auth/services/auth.service';
import { EventService } from '../../events/services/event.service';
import { IEvent } from '../../events/model/ievent.model';
import { error } from 'console';
@Component({
  selector: 'app-organizer',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './organizer.component.html',
  styleUrl: './organizer.component.css'
})
export class OrganizerComponent implements OnInit {
  events: IEvent[] = [];
  constructor(private authService : AuthService,private eventService : EventService){}

  ngOnInit(): void {
    this. OnClickLoadOrganizerEvents();
  }
 OnClickLoadOrganizerEvents() {
    const organizerEmail = this.authService.getUserEmail(); 
    console.log('Organizer Email:', organizerEmail); 
  
    if (organizerEmail) {
      this.eventService.getEventsByOrganizer(organizerEmail).subscribe(
        (events: IEvent[]) => {
          this.events = events;
          console.log('Organizer Events:', this.events);
        }
        
      );
    } else {
      console.error('Organizer email not found.'); 
    }
  }
}

