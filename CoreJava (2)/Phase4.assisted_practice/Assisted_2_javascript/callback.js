function fullName(firstName, lastName, callback){
    console.log("My name is " + firstName + " " + lastName);
    callback(firstName);
  }
  
  var greeting = function(fn){
    console.log('Welcome ' + fn);
  };
  
  fullName("Alex", "Wilson", greeting);
  console.log("\n");
  fullName("Dexter", "Johnson", greeting);
