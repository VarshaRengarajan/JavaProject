import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'myportfolio';
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
  }
}
