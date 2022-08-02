package Assistedpractice3;
import java.util.*;

public class Queueeg 
{
public static void main(String[] args) 
{
        		Queue<String> things = new LinkedList<>();
                things.add("notebook");
        		things.add("Pen");
        		things.add("Duster");
        		things.add("box");
        		things.add("pencil");
                System.out.println("Queue is : " +things);
        		System.out.println("Head of Queue : " +things.peek());
        		things.remove();
        		System.out.println("After removing Head of Queue : " +things);
        		System.out.println("Size of Queue : " +things.size());
    	}
}


