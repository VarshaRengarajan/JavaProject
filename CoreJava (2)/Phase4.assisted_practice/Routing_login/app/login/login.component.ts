import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username = 'user';
  password = '';
  errorMessage = 'Invalid Credentials';
  invalidLogin = false;

  //Router
  //Angular.giveMeRouter()
  //Dependency Injection
  constructor(private router: Router){}
  ngOnInit() {
  }

  handleLogin() {
     if ( this.username === 'user' && this.password === '1234'){
    
    //redirect to welcome Page
      this.router.navigate(['welcome',this.username]);
      this.invalidLogin = false;
    }else {
      this.invalidLogin = true;
    }
   }

}
