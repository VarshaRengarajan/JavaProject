package Assistedprojects;
import java.util.*;

public class Collectionproject6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Bangalore");//
	      city.add("Delhi");    	   
	      System.out.println(city); 
	      
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector vec = new Vector();
	      vec.addElement(23); 
	      vec.addElement(39); 
	      System.out.println(vec);
	      
	      
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("JO");  
	      names.add("JAY");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(115);  
	       set.add(114);  
	       set.add(113);
	       set.add(112);
	       System.out.println(set);
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 

	       

	       

  


	}}


