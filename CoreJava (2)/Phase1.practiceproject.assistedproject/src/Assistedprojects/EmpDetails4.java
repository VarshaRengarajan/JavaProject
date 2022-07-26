package Assistedprojects;



class EmpDetails4 {
	int id;
	String name;
	
	public void EmpDetails()  // default constructor
	{
		id=10;
		name = "hello";
		System.out.println("i m inside the default constructor");
	}
	
	//method to display the value of id and name  
	void display()  //default modifier
	{
		System.out.println(id+" "+name);
	}  
	  
public static void main(String args[]){  
	//creating objects  
	
	
	EmpDetails4 s2=new EmpDetails4();  // object of class
	
	//displaying values of the object  
	 
	s2.display();  
    }  
}  

