package Week2;

class Product{
	int id=78;
	String name="Amul";
	void display(){
		System.out.println("The id is:"+id);
		System.out.println("The name is:"+name);
	}
}
class A extends Product{
	int count=50;
	String category="butter";
	void display(){
		System.out.println(id+" "+name+" "+count+" "+category);
		
	}
}
class B extends Product{
	int count=90;
	String category="Milk";
			void display(){
				System.out.println(id+" "+name+" "+count+" "+category);
			}
}
class C extends Product{
	int count=56;
	String category="choco";
	void display(){
		System.out.println(id+" "+name+" "+count+" "+category);
	}
}

	




public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		obj1.display();
		obj3.display();
	
		obj2.display();
		
		

	}

}

