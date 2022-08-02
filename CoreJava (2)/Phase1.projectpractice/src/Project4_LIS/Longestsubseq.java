package Project1;
import java.util.Scanner;

public class Longestsubseq {
    
    public static void longestsubseq(int[] array){
	
        //creating size and path array
        String[] paths = new String[array.length];
        int[] sizes = new int[array.length];

       //Initially, assign sizes and path position
        for(int i=0; i<array.length; i++){
            sizes[i] = 1;
            paths[i] = array[i] + " " ;
        }

       //Creating maxLength to keep track
        int maxLength = 1; 
    
        for(int i=1; i<array.length; i++){ 
    	for(int j=0; j<array.length; j++){
        // i at firstposition	
        // j at zeroposition 

        //here j<i and size must be increasing
        if(array[i]>array[j] && sizes[i] < sizes[j] + 1){
    	//if so, we need to update sizes and path
    	sizes[i] = sizes[j] + 1;
    	paths[i] = paths[j] + array[i] + " "; 
    	// append current values to end!!
    	
    	if(maxLength < sizes[i])
    		maxLength = sizes[i];
    	}
       }
    }

        // finally go scanning the size of array again and print out the path when size matches
       for(int i=1; i<array.length; i++){
           if(sizes[i] == maxLength)
    	System.out.println("longest increasing subsequence: " + paths[i]);
        }
       }
     
    public static void main(String[] args){

        //int[] array = {1,3,2,9,6,10,5,12,38};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array to be passed: ");
        int num = sc.nextInt();
        
        
    	int[] array = new int[num];  
    	System.out.println("Enter the elements of the array: "); 
    	for(int i=0; i<num; i++)  
    	{  
    	 
    	array[i]=sc.nextInt();  
    	}  
   
        Longestsubseq incseq = new Longestsubseq();
        incseq.longestsubseq(array);
    }
}
