package Assistedprojects;
import java.util.*;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1, "Harry");
		hm.put(2, "Ron");
		hm.put(3, "Raj");
		
	    System.out.println("\nThe elements of Hashmap are ");  
	    for(Entry<Integer, String> m:hm.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	      }
	    
	    Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Alex");  
	      ht.put(5,"Viji");  
	      ht.put(6,"Ran");  
	      ht.put(7,"Thenu");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Entry<Integer, String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Ann");    
	      map.put(9,"Char");    
	      map.put(10,"Chil");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Entry<Integer, String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    

	      
	      

	      

		
		

	}

}
