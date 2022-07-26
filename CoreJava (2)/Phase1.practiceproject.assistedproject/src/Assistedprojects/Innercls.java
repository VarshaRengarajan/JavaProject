package Assistedprojects;

public class Innercls {

	private String name="Shailey"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(name+" "+"Hello how are you");}  
	 }  


	public static void main(String[] args) {

		Innercls obj=new Innercls();
		Innercls.Inner in=obj.new Inner();  
		in.hello();  
	}
}







