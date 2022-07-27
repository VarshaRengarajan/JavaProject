package phase1.modifier.p1;

public class Testm {
	private int j=10 ;
	long k=1000;
	protected float l=50;
	
	
	public void methodPublic(){     // public method
		
	}
	
	protected void methodProtected(){ 
		System.out.println("Protected method of m"+l);
		
	}
	
	void methodDefault(){   
		System.out.println("Default method of m"+ k);
	
	}
	
	private void methodPrivate(){     // private method
		
		System.out.println("Private method of m"+ j);
		
	}
}
	
			


