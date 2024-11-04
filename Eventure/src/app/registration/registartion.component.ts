import { Component, ElementRef, ViewChild } from '@angular/core';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
})
export class UserSettingsComponent {
  // Access the form element
  @ViewChild('registrationForm', { static: false }) registrationForm!: ElementRef;

  // Method to handle form submission
  onRegister() {
    alert("Event Registered"); // Display alert

    // Reset the form fields
    if (this.registrationForm) {
      this.registrationForm.nativeElement.reset();
    }
  }
}

