import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-menu-list',
  standalone: true,
  imports: [RouterModule,CommonModule],
  templateUrl: './menu-list.component.html',
  styles: `a{
    color: gray;
    font-weight: bold;
  }
  button:{
    margin-left: 15px;
  }
  `
})
export class MenuListComponent {
  menuLinks = [
    {linkName : "Home",linkPath : "/"},
    {linkName : "Events",linkPath : "/event"},
    {linkName : "AboutUs", linkPath : "/about"},
  ];
}