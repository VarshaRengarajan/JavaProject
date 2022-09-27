import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new',
  templateUrl: './new.component.html',
  styleUrls: ['./new.component.css']
})
export class NewComponent implements OnInit {
  isLogIn : boolean = false;
  isLogOut : boolean = true; 
  list = [1,2,3,4,5];

  constructor() { }

  ngOnInit() {
  }

}
