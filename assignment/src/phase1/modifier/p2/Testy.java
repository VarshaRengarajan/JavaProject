package phase1.modifier.p2;
import  phase1.modifier.p1.testn;
import phase1.modifier.p1.Testm;

public class Testy extends testn{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Testy().methodPublic();
		new Testy().methodProtected();
		
		System.out.println("value of long:"+new Testx().y);
		System.out.println("value of float:"+new Testx().z);
		System.out.println("value of char:"+new Testx().d);
		
	
	}

}
