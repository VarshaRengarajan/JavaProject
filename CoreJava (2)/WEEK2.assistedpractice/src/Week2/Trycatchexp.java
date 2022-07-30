package Week2;

public class Trycatchexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		int b=0;
		int c;
		
		try{
			c=a/b;
			System.out.println("The answer is:"+c);
		}
		catch(ArithmeticException ae)//child
		{
			System.out.println("numbers cannot be divided by zero");
			
		}
		catch(Exception ae1){//parent
			System.out.println("i am before the subclass exception");
		}
		finally
		{
			System.out.println("this block will always executed");
		}
		
	c=a+b;
	System.out.println("Result after addition :"+c);
	

	}




}


