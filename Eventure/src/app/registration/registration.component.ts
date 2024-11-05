import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormGroup, ReactiveFormsModule, FormControl, Validators } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { EventService } from '../events/services/event.service';
import { UserService} from '../users/services/user/user.service';
@Component({
  selector: 'app-user-settings',
  standalone: true,
  imports: [RouterModule, ReactiveFormsModule, CommonModule],
  templateUrl: './registration.component.html',
  styleUrl: './registration.component.css'
})
export class UserSettingsComponent {
  registrationForm: FormGroup;
  isSaved = false;
  constructor(private userService:UserService) {
    this.registrationForm = new FormGroup({
      name: new FormControl('', Validators.required),
      phone: new FormControl('', [Validators.required, Validators.pattern("[0-9]{10}")]),
      email: new FormControl('', [Validators.required, Validators.email]),

    });
  }
  handleSubmit() {
   
        const userData = {
            u_name: this.registrationForm.value.name, 
            u_email: this.registrationForm.value.email,
            u_number:this.registrationForm.value.email 
        };
        console.log('user Data:', userData);

        this.userService.addUser(userData)
            .subscribe((response: any) => {
                console.log(response);
                this.isSaved = true;
                this.registrationForm.reset();
            });  
}
}

  // Access the form element
  