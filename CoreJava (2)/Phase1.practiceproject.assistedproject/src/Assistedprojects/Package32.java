package Assistedprojects;

public class Package32 {
	public void area(int i,int j){
		System.out.println("The area of rectangle:"+(i*j));
	}
	public void area(double r){
		System.out.println("The area of circle:"+(3.14*r*r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Package32 s1=new Package32();
		s1.area(5,8);
		s1.area(8.78);

	}

}
