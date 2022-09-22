const empId = (function() {
    let count = 0;
    return function() {
      ++count;
      return empId`{count}`;
    };
  })();
  
  console.log("New Emplyee IDs are listed here");
  console.log("Ann: "+empId()); 
  console.log("Vij: "+empId()); 
  console.log("Mani: "+empId());

