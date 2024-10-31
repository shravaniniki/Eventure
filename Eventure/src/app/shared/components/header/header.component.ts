import { Component } from '@angular/core';
import { MenuListComponent } from "../menu-list/menu-list.component";

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [MenuListComponent],
  templateUrl: './header.component.html',
  styles: `a{
    color:#f74d6d ; 
    font-size: 30px; 
    font-weight: bold;
  }`
})
export class HeaderComponent {

}
