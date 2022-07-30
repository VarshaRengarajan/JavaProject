package Week2;

abstract class MNC{
	MNC(){
		System.out.println("i am the parent mnc");
	}
	abstract void IT1();
	
	abstract void IT2();
	void IT(){
		System.out.println("IT is the dept");
	}
}
abstract class XYZ extends MNC{
	abstract void IT();
}
class Hello extends XYZ{
	 void IT1(){
		 System.out.println("it1 dept");
	 }
	 void IT2(){
		 System.out.println("it2 dept");
	 }
	 void IT(){
		 System.out.println("it dept");
	 }
	void Dept(){
		System.out.println("this is the dept");
	}
}
public class abstr {
	public static void main(String args[]) {
		 MNC obj=new Hello();
		 obj.IT();
		 obj.IT2();
		
	}

}
