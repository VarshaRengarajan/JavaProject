



var map1 = new Map(); 
map1.set("first name", "Rik"); 
map1.set("last name", "Sass"); 
map1.set("person 1","Bran") 
    .set("person 2","Arya"); 
console.log(map1); 
console.log("map1 has person 3 ? " + map1.has("person 3")); 
console.log("get value for key = person 1 - "+ map1.get("person 1")); 
console.log("delete element with key = person 2 - " + map1.delete("person 2")); 
map1.clear(); 
console.log(map1);
class Employee
{
    constructor(id,name)
    {
      this.id=id;
      this.name=name;
    }
    detail()
    {
  document.writeln(this.id+" "+this.name+"<br>")
    }
  }
//passing object to a variable 
var e1=new Employee(101,"Mia");
var e2=new Employee(102,"min");
e1.detail(); 
e2.detail();
