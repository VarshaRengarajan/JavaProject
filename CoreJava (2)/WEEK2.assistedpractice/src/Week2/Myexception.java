package Week2;

class Main extends Exception {
	
	    public Main(String s) 
	    { 
	        super(s); 
	    } 
	} 
	public class Myexception
	{ 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new Main("Custom exception"); 
	        } 
	        catch (Main mn) 
	        { 
	            System.out.println("Display"); 
	            System.out.println(mn.getMessage()); 
	        } 
	    } 
	}


	