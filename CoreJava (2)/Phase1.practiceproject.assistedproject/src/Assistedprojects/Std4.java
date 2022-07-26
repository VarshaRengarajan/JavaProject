package Assistedprojects;

public class Std4 {
	int age;
	String name;
	
	Std4(int i,String j){
		age=i;
		name=j;
	}
	void display(){
		System.out.println(age+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Std4 obj = new Std4(22,"meera");
		obj.display();

	}

}
