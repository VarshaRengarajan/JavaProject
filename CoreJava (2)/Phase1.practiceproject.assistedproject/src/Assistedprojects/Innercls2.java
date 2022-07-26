package Assistedprojects;

public class Innercls2 {
	

	private String msg="Definition of innerclasses";

	void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	 }  
	 
	 Inner l=new Inner();  
	 l.msg();  
	}  


	public static void main(String[] args) {
		Innercls2 ob=new Innercls2();  
		ob.display();  
		}
	}

	

