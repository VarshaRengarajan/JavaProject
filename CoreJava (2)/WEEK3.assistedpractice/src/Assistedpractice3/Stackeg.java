package Assistedpractice3;
import java.util.*;

public class Stackeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		Stack <Integer> stk = new Stack<>();  
		System.out.println("stack: " + stk);  
		//pushing elements into the stack  
		pushelmnt(stk, 2);  
		pushelmnt(stk, 1);  
		pushelmnt(stk, 60);  
		pushelmnt(stk, 9);  
		pushelmnt(stk, 19);  
		pushelmnt(stk, 10);  
		pushelmnt(stk, 14);  
		//popping elements from the stack  
		popelmnt(stk);  
		popelmnt(stk);  
		//throws exception if the stack is empty  
		try   
		{  
		popelmnt(stk);  
		}   
		catch (EmptyStackException e)   
		{  
		System.out.println("empty stack");  
		}  
		}  
		//performing push operation  
		static void pushelmnt(Stack stk, int x)   
		{  
		//invoking push() method      
		stk.push(new Integer(x));  
		System.out.println("push -> " + x);  
		//prints modified stack  
		System.out.println("stack: " + stk);  
		}  
		//performing pop operation  
		static void popelmnt(Stack stk)   
		{  
		System.out.print("pop -> ");  
		//invoking pop() method   
		Integer x = (Integer) stk.pop();  
		System.out.println(x);  
		//prints modified stack  
		System.out.println("stack: " + stk);  
		 
		 

	}

}
