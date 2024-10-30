import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { OrganizerComponent } from './profile/components/organizer/organizer.component';

export const routes: Routes = [
  {path: '',component: HomeComponent, title:'Home'},
  {path: 'about',component:AboutComponent, title: 'About'},
  {path: 'profile', children:[
    {path: 'organizer', component: OrganizerComponent, title: 'Profile'}
  ]}
  
];
