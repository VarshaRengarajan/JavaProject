package Project1;
import java.util.*;

public class Calculator {
    
	public void Operation(double num1,int num2, long num3, char ch){
	    
	    if(ch=='+'){
		    System.out.println("Addition output:"+(num1+num2+num3));
	    }
	    else if(ch=='-'){
		    System.out.println("Subtraction output:"+(num1-num2-(int)num3));
	    }
	    else if(ch=='*'){
		    System.out.println("Multiplication output:"+(num1*num2*(double)num3));
	    }
	    else if(ch=='/'){
		    System.out.println("Division output:"+(num1/num2/num3));
	    }
	    else{
	        System.out.println("Please select valid operator");
	    }
    }
    
    
	public static void main(String[] args) {
	    
	        double num1;
	        int num2;
	        long num3;
	        
	        Scanner sc= new Scanner(System.in);  
	        System.out.print("Enter three numbers:\n");  
	        
	        num1 = sc.nextDouble();
	        
	        num2 = sc.nextInt();
	        
	        num3 = sc.nextLong();
	        
	        System.out.print("Enter the operation to be performed (+,-,*,/):\n");
	        char ch = sc.next().charAt(0);    
			
	        Calculator cal = new Calculator();
            cal.Operation(num1,num2,num3,ch);
			
	}

}


