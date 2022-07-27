package phase1.modifier.p1;

public class testn {
	protected long a=50L;
	public int b=12;
	double c=2000;
	
	
	public void methodPublic(){     // public method
		System.out.println("public value of n"+ b);
	}
	
	protected void methodProtected(){   // protected method
		System.out.println("protected value of n"+ a);
	}
	
	void methodDefault(){    //default method
		System.out.println("default value of n"+c);
	}
	

}


