import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { OrganizerComponent } from './profile/components/organizer/organizer.component';
import { ListEventsComponent } from './events/components/list-events/list-events.component';
import { AddEventComponent } from './events/components/add-event/add-event.component';
import { EventDetailsComponent } from './events/components/event-details/event-details.component';
import { UpdateEventComponent } from './events/components/update-event/update-event.component';
import { DeleteEventComponent } from './events/components/delete-event/delete-event.component';

export const routes: Routes = [
  {path: '',component: HomeComponent, title:'Eventure'},
  {path: 'about',component:AboutComponent, title: 'About'},
  {path: 'profile', children:[
    {path: 'organizer', component: OrganizerComponent, title: 'Profile'}
  ]},
  {path: 'events', children:[
    {path: '', component: ListEventsComponent, title: 'Events'},
    {path: 'add', component: AddEventComponent, title: 'Events'},
    {path: 'id', component: EventDetailsComponent, title: 'Events'},
    {path: 'edit', component: UpdateEventComponent, title: 'Events'},
    {path: 'id', component: DeleteEventComponent, title: 'Events'},
  ]}
  
];
