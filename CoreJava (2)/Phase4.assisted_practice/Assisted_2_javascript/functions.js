function Employee(name,salary,yearOfBirth){
    this.name=name;
    this.salary=salary;
    this.yearOfBirth=yearOfBirth;
}

Employee.prototype.calculateAge=function(){
    console.log('The age is:'+(2022-this.yearOfBirth))
}
console.log(Employee.prototype);

let Employee1=new Employee('varsh',50000,2000);
console.log(Employee1);
Employee1.calculateAge();