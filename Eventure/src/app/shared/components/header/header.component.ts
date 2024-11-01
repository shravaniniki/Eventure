import { Component, HostListener } from '@angular/core';
import { MenuListComponent } from "../menu-list/menu-list.component";
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [MenuListComponent, CommonModule],
  templateUrl: './header.component.html',
  styles: `
  a{
    color:#f74d6d ; 
    font-size: 30px; 
    font-weight: bold;
    padding-left: 40px;
  }
  
  header {
  height: 70px;
  background-color: transparent; /* Default transparent background */
  transition: background-color 0.3s ease; /* Add a smooth transition */
  }

.header-solid {
  background-color: #f0f0f0; /* Your desired solid background color */
  }
`
})
export class HeaderComponent {
  showHeader = false; // Flag to control header display

  constructor() { }

  ngOnInit() { }

  @HostListener('window:scroll', ['$event'])
  onWindowScroll(event: Event) {
    const scrollTop = window.pageYOffset || document.documentElement.scrollTop;
    if (scrollTop > 0) {
      this.showHeader = true;
    } else {
      this.showHeader = false;
    }
  }
}
