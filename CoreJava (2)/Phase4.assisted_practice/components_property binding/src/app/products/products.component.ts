import { Component } from '@angular/core';

@Component({
  selector: 'products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent  {

 pageTitle:string = "product page"

}
export class ProductListComponent{
  pageTitle: string = "Product List Page";
  imageWidth:number = 80;
  imageMargin:number = 10;

  showImage:boolean = false;

  toggleImage() : void {
      this.showImage = !this.showImage;
      // (!false = true) // (!true == false)
console.log('Value of ShowImage inside function ::',                              
this.showImage);   
  }
}
