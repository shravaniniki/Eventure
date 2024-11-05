import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormGroup, ReactiveFormsModule, FormControl, Validators } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { EventService } from '../events/services/event.service';
import { UserService} from '../users/services/user/user.service';
@Component({
  selector: 'app-user-settings',
  standalone: true,
  imports: [RouterModule, ReactiveFormsModule, CommonModule],
  templateUrl: './registration.component.html',
  styleUrl: './registration.component.css'
})
export class RegistrationComponent {
  registrationForm: FormGroup;
  isSaved = false;
  constructor(private route:Router,private userService:UserService) {
    this.registrationForm = new FormGroup({
      name: new FormControl('', Validators.required),
      phone: new FormControl('', [Validators.required, Validators.pattern("[0-9]{10}")]),
      email: new FormControl('', [Validators.required, Validators.email]),

    });
  }
  handleSubmit() {
    this.isSaved = true;
    if(this.isSaved=true){
      alert("Thank for using Eventure. You have been registered");
      this.route.navigateByUrl("/list");
    }
   
}
}

