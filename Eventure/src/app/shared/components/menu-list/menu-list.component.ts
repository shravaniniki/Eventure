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
  /* User Email Styling */
.user-email {
  color: #f82249; /* Change this to your preferred color */
  font-weight: bold;
  padding: 0 10px; /* Add some spacing around the email */
  font-size: 1.1em; /* Slightly increase the font size for emphasis */
  border: 1px solid #f82249; /* Optional: add a border */
  border-radius: 5px; /* Rounded corners */
  padding: 5px; /* Padding for better spacing */
}

/* Logout Button Styling */
.btn-logout {
  background-color: #f82249; /* Button background color */
  color: white; /* Text color */
  border: none; /* Remove default border */
  border-radius: 5px; /* Rounded corners */
  padding: 10px 15px; /* Add padding for size */
  font-weight: bold; /* Bold text */
  cursor: pointer; /* Change cursor to pointer */
  transition: background-color 0.3s; /* Smooth transition for hover effect */
}

/* Hover Effect for Logout Button */
.btn-logout:hover {
  background-color: #d7113e; /* Darker shade on hover */
}

   `
})
export class MenuListComponent implements OnInit {
  loggedInEmail: string | null = null; // Variable to store logged-in email

  menuLinks = [
    { linkName: "Home", linkPath: "/" },
    { linkName: "Events", linkPath: "/list" },
    { linkName: "AboutUs", linkPath: "/about" },
    { linkName: "Contact", linkPath: "/contact" }
  ];

  constructor(private authService: AuthService) {}

  ngOnInit() {
    // Subscribe to loggedInEmail$ to get updates on login status
    this.authService.loggedInEmail$.subscribe((email) => {
      this.loggedInEmail = email;
    });
  }
  //loggedInEmail = localStorage.getItem('loggedInEmail'); // Retrieve email from local storage

  logout() {
    localStorage.removeItem('loggedInEmail'); // Clear email from local storage
    this.loggedInEmail = null; // Reset the variable
  }
}

