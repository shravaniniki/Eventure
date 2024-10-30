import { Component } from '@angular/core';
import { MenuListComponent } from "../menu-list/menu-list.component";

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [MenuListComponent],
  templateUrl: './header.component.html',
  styles: ``
})
export class HeaderComponent {

}
