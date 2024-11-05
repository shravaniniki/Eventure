import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';

import { EventService } from '../../services/event.service';
import { HttpClientModule } from '@angular/common/http';
import { IEvent } from '../../model/ievent.model';
import { AuthService } from '../../../auth/services/auth.service';



@Component({
  selector: 'app-list-events',
  standalone: true,
  imports: [RouterModule,CommonModule],
  templateUrl: './list-events.component.html',
  styles: `
  .card-container {
    display: flex;
    flex-wrap: wrap;
    gap: 15px; /* Controls spacing between cards */
    justify-content: center;
}

/* Flip Card Container */
.flip-card {
    background-color: transparent;
    width: 320px;
    height: 380px;
    border: none;
    perspective: 1000px;
    margin: 15px;
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

/* Front and Back Side Styling */
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
    background-color: #5072A7; /* Navy blue for front */
    color: white; /* Light gray text */
    display: flex;
    flex-direction: column;
    justify-content: center;
}

/* Back Side Style */
.flip-card-back {
    background-color: #34495e; /* Slightly darker navy */
    color: white; /* Light gray text */
    transform: rotateY(180deg);
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}

/* Typography and Layout */
.card-title {
    font-size: 1.25rem;
    color: white;
    margin-bottom: 1rem;
}

.text-accent {
    color: #004687;
}
/* Event Name Style */
.event-name {
    font-family: 'Georgia', serif; /* A classic serif font for elegance */
    font-size: 1.5rem; /* Larger size for prominence */
    margin-bottom: 1rem; /* Spacing below the title */
}

/* Event List Style */
.event-list {
    font-family: 'Arial', sans-serif; /* A clean sans-serif font for readability */
    font-size: 1rem; /* Standard size for list items */
    color: #bdc3c7; /* Lighter color for a softer look */
}

/* Strong Element Style in List */
.event-list strong {
    color: #ecf0f1; /* A lighter color for strong elements */
}

/* Spacing Between List Items */
.event-list li {
    margin-bottom: 0.5rem; /* Space between list items */
}

.btn-outline-light {
    border-color: #2980b9;
    color: #2980b9;
}
.btn-outline-light:hover {
    background-color: #2980b9;
    color: #ecf0f1;
}

  `
})
export class ListEventsComponent implements OnInit {
  events: IEvent[] = [];
  router: any;
  
  constructor(private eventService: EventService,private authService: AuthService) {
    
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

  isLoggedIn(): boolean {
    return this.authService.isLoggedIn();
  }

  // Method to log the user out
  logout(): void {
    this.authService.logout();
  }
}
