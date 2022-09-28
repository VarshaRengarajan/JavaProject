import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {

  constructor(private router: Router) {
  }

  goToIndex() {
    this.router.navigate(['/', 'home']);
  }
  goToAboutUs() {
    this.router.navigate(['/', 'about']);
  }
  goToPortfolio() {
    this.router.navigate(['/', 'portfolio']);
  }
  goToContact() {
    this.router.navigate(['/', 'contact']);

 
 

}}
