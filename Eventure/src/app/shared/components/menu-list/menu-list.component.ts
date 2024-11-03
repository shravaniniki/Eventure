import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-menu-list',
  standalone: true,
  imports: [RouterModule, CommonModule],
  templateUrl: './menu-list.component.html',
  styles: `
  ul{
    margin-right: 20px;
  }
  a{
    color: gray;
    font-weight: bold;
  }
  
  button{
    margin-left: 10px;
  }

  .nav-menu {
  position: relative; /* Needed for absolute positioning of the underline */
  }

  .nav-menu a {
  position: relative; /* Needed for absolute positioning of the underline */
  display: block;     /* Makes the link take up the full width of its container */
  padding-bottom: 5px; /* Add some space for the underline */
  }

  .nav-menu a::before {
  content: "";
  position: absolute;
  bottom: 0;
  left: 0;
  width: 0;
  height: 2px;
  background-color: #f82249; /* Or your desired color */
  transition: width 0.3s ease; /* Add a smooth transition */
  }

  .nav-menu a:hover::before {
  width: 100%; /* Extend the underline to full width on hover */
  }

.nav-menu a.active::before {
    width: 100%; /* Extend the underline when the link is active */
}
  `
})
export class MenuListComponent {
  menuLinks = [
    { linkName: "Home", linkPath: "/" },
    { linkName: "Events", linkPath: "/list" },
    { linkName: "AboutUs", linkPath: "/about" },
    { linkName: "Contact", linkPath: "/contact" },

  ];


}
