package phase1.modifier.p2;

public class Testx {
	private int x=15;
	long y=2000;
	protected float z=5;
	public char d='w';
	
	public void methodPublic(){     // public method
		System.out.println("value of char"+d);
	}
	
	protected void methodProtected(){   // protected method
		System.out.println("Value of private value x"+ x);
	}
	
	void methodDefault(){    //default method
		System.out.println("Value of long"+ y);
	}
	
	private void methodPrivate(){     // private method
		
		
		System.out.println("Value of float"+z);
		
	
	}

}
