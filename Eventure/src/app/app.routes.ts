import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { OrganizerComponent } from './home/organizer/organizer.component';
import { ListEventsComponent } from './events/components/list-events/list-events.component';
import { AddEventComponent } from './events/components/add-event/add-event.component';
import { EventDetailsComponent } from './events/components/event-details/event-details.component';
import { UpdateEventComponent } from './events/components/update-event/update-event.component';
import { DeleteEventComponent } from './events/components/delete-event/delete-event.component';
import { ContactComponent } from './contact/contact.component';
import { UserComponent } from './profile/components/user/user.component';
import { UserSettingsComponent } from './registration/registartion.component';
import { OrganizerProfileComponent } from './profile/components/organizer-profile/organizer-profile.component';
import { UserProfileComponent } from './profile/components/user-profile/user-profile.component';
import { LoginComponent } from './auth/components/login/login.component';
import { SignUpComponent } from './auth/components/sign-up/sign-up.component';
export const routes: Routes = [
  { path: '', component: HomeComponent, title: 'Eventure' },
  { path: 'list', component: ListEventsComponent, title: 'home' },
  { path: 'login', component: LoginComponent, title: 'login' },
  { path: 'sign-up', component: SignUpComponent, title: 'sign-up' },
  {
		path: 'events', children: [
				{ path: 'add', component: AddEventComponent ,  title: 'Add Event'  },
				{ path: ':id/delete', component: DeleteEventComponent,  title: 'Delete Event'  },
				{ path: ':id/edit', component: UpdateEventComponent,  title: 'Update Event'  }, //id is url parameter
				{ path: '', component: ListEventsComponent,  title: 'Events'  },
				{ path: ':id', component: EventDetailsComponent,  title: 'Event Detail'  },

		]
},
  { path: 'about', component: AboutComponent, title: 'About' },
  { path: 'users-profile', component: UserComponent, title: 'Profile' },
  { path: 'contact', component: ContactComponent, title: 'Contact' },
  { path: 'registration', component: UserSettingsComponent, title: 'UserSettings' },
  { path: 'organizer', component: OrganizerComponent, title: 'EventOrganizer' },
  {
    path: 'profile', children: [
      { path: 'organizer-profile', component: OrganizerProfileComponent, title: 'Profile' },
      { path: 'user-profile', component: UserProfileComponent, title: 'Profile' }
    ]
  },
  {
    path: 'events', children: [
      // {path: '', component: ListEventsComponent, title: 'Events'},
      //{path: 'add', component: AddEventComponent, title: 'Events'},
      { path: 'id', component: EventDetailsComponent, title: 'Events' },
      { path: 'edit', component: UpdateEventComponent, title: 'Events' },
      { path: 'id', component: DeleteEventComponent, title: 'Events' },
      
    ]
  }
];
