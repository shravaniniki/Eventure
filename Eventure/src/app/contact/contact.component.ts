import { Component } from '@angular/core';

@Component({
  selector: 'app-contact',
  standalone: true,
  imports: [],
  template: `
   <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<div class="container contact-form">
    <div class="contact-image">
        <img src="https://image.ibb.co/kUagtU/rocket_contact.png" alt="rocket_contact"/>
    </div>
    <h3>Contact Information</h3>
    <div class="row">
        <div class="col-md-6">
            <h4>Email Ids</h4>
            <ul class="list-group">
                <li class="list-group-item">Varshini: varshinisriram02</li>
                <li class="list-group-item">Shravani: shravani </li>
                <li class="list-group-item">Sharmila: sharmila </li>
                <li class="list-group-item">Janani: janani </li>
            </ul>
        </div>
        <div class="col-md-6">
            <h4>Phone Number</h4>
            <p class="text-muted">1234567899</p>
        </div>
    </div>
</div>

  `,
  styles: `
  .contact-form {
        background: #f9f9f9;
        margin-top: 5%;
        padding: 3%;
        border-radius: 0.5rem;
        box-shadow: 0px 0px 10px 0px #000;
    }
    .contact-image img {
        width: 100px;
        margin-top: -15%;
        transform: rotate(29deg);
    }
    .list-group-item {
        background-color: #e9ecef;
        border: 1px solid #ccc;
        margin-bottom: 5px;
    }
  `
})
export class ContactComponent {

}
