import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';

import { EventService } from '../../services/event.service';
import { HttpClientModule } from '@angular/common/http';
import { IEvent } from '../../model/ievent.model';



@Component({
  selector: 'app-list-events',
  standalone: true,
  imports: [RouterModule,CommonModule],
  templateUrl: './list-events.component.html',
  styles: `

.card-container {
    display: flex;
    flex-wrap: wrap;
    gap: 15px;
    justify-content: center;
}

.flip-card {
    background-color: transparent;
    width: 320px;
    height: 380px;
    border: none;
    perspective: 1000px;
    margin: 15px;
}

.lead.text-muted {
    color: white;
}

.flip-card-inner {
    position: relative;
    width: 100%;
    height: 100%;
    transition: transform 0.8s;
    transform-style: preserve-3d;
}

.flip-card:hover .flip-card-inner {
    transform: rotateY(180deg);
}

.flip-card-front, .flip-card-back {
    position: absolute;
    width: 100%;
    height: 100%;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.15);
    backface-visibility: hidden;
}

/* Front Side Style */
.flip-card-front {
    background-color: #8E2945; /* Subtle reddish-pink */
    color: white;
    display: flex;
    flex-direction: column;
    justify-content: center;
    padding: 20px;
}

/* Title Styling */
.card-title {
    font-size: 1.75rem; /* Increase font size */
    font-family: 'Playfair Display', serif; /* Stylish serif font */
    color: #FFFFFF; /* Bright white */
    text-shadow: 1px 1px 6px rgba(0, 0, 0, 0.3); /* Add shadow for contrast */
    margin-bottom: 1rem;
    text-align: center;
}

/* Back Side Style */
.flip-card-back {
    background-color: #8E2945; /* Slightly muted reddish-pink */
    color: white;
    transform: rotateY(180deg);
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    opacity: 200px;
}

.event-name {
    font-family: 'Georgia', serif;
    font-size: 1.5rem;
    margin-bottom: 1rem;
}

.event-list {
    font-family: 'Arial', sans-serif;
    font-size: 1rem;
    color: white;
}

.event-list strong {
    color: #FFCDD2;
}

.event-list li {
    margin-bottom: 0.5rem;
}

.btn-outline-light {
    border-color: #D81B60;
    color: #D81B60;
}

.btn-outline-light:hover {
    background-color: #D81B60;
    color: #FFFFFF;
}


  `
})
export class ListEventsComponent implements OnInit {
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
