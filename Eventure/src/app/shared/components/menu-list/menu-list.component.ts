import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthService } from '../../../auth/services/auth.service';

@Component({
  selector: 'app-menu-list',
  standalone: true,
  imports: [RouterModule, CommonModule],
  templateUrl: './menu-list.component.html',
  styles: ` 
  .nav-menu a{
    color:gray;
    font-weight: bold;
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
/* User Email Styling */
.user-email {
  color: #f82249; 
  font-weight: bold;
  padding: 5px 10px; 
  font-size: 1.1em; 
  border: 1px solid #f82249; 
  border-radius: 5px; 
  cursor: pointer; 
}

/* Logout Dropdown Styling */
.logout-dropdown {
  position: absolute; /* Ensures the dropdown appears in the correct place */
  background-color: white; /* Background color for the dropdown */
  border: 1px solid #f82249; /* Border color */
  border-radius: 5px; /* Rounded corners */
  margin-top: 5px; /* Space between email and dropdown */
  z-index: 1000; /* Ensure it's on top */
  padding: 5px; /* Reduced padding */
  width: 50px; /* Set width to fit content */
}

/* Logout Button Styling */
.btn-logout {
  background-color: transparent; /* No background color */
  border: none; /* Remove default border */
  color: #f82249; /* Text color to match your theme */
  font-weight: bold; /* Bold text */
  padding: 4px 8px; /* Reduced padding */
  font-size: 0.85em; /* Slightly smaller font size */
  border-radius: 3px; /* Rounded corners */
  cursor: pointer; /* Change cursor to pointer */
  width: auto; /* Remove full width to fit content */
  transition: background-color 0.3s, transform 0.2s; /* Smooth transition for hover effect */
}

/* Hover Effect for Logout Button */
.btn-logout:hover {
  background-color: rgba(248, 34, 73, 0.1); /* Light background on hover */
  transform: scale(1.03); /* Slightly enlarge on hover for effect */
}

  `,
})
export class MenuListComponent implements OnInit {
  loggedInEmail: string | null = null;
  showLogoutDropdown: boolean = false;

  menuLinks = [
    { linkName: 'Home', linkPath: '/' },
    { linkName: 'Events', linkPath: '/list' },
    { linkName: 'About Us', linkPath: '/about' },
    { linkName: 'Contact', linkPath: '/contact' },
  ];

  constructor(private authService: AuthService) {}

  ngOnInit() {
    this.authService.loggedInEmail$.subscribe((email: string | null) => {
      this.loggedInEmail = email;
    });
  }
  toggleLogoutDropdown() {
    this.showLogoutDropdown = !this.showLogoutDropdown;
  }

  logout() {
    localStorage.removeItem('loggedInEmail');
    this.loggedInEmail = null;
    this.showLogoutDropdown = false;
  }
}
