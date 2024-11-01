import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { IEvent } from '../events/model/ievent.model';
import { EventService } from '../events/services/event.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [RouterModule, CommonModule],
  templateUrl: './home.component.html',
  styleUrl: `./home.component.css`
})
export class HomeComponent {
  events: IEvent[] = [];
  router: any;

  constructor(private eventService: EventService) {

  }
  ngOnInit(): void {
    // Connect to the Service using dep injection
    // 1. Send the request to the service
    // 2. Get the response from the service
    
    this.eventService.getEvents().subscribe((response: IEvent[]) => {
      
      console.log(response);
      this.events = response;
    })

  }
}
