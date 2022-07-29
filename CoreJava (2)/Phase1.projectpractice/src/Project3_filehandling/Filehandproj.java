package project1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;


public class Filehandproj {
    
    // method to read file
    public void read_file(String filepath){
    	
        FileReader fr;
		try {
			fr = new FileReader(filepath);
			 int i;
			    while((i = fr.read()) != -1) 
			    {
		            System.out.print((char)i);
			    }
			    fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    
		String filepath="D:/Git/Assignments_java/project_file.txt";
		
		Filehandproj fh = new Filehandproj();
		
		// checking if file exists
		try {  
            File file = new File(filepath);  // this is used to create the file
            
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } 
            else {                   
                if(file.exists()){
                    System.out.println("File already exists.");	
                }
            }
            System.out.println("----------------------------------");
		} 
        catch (IOException e) {  
            e.printStackTrace();  
        } 
         
		//File read
		System.out.println("Reading content in the file...");
		try {
			File file = new File(filepath);
			if (file.length() == 0) {
			    System.out.println("file is empty");
			}
			else{
				System.out.println("\n");
				fh.read_file(filepath);
			    }   
			System.out.println("\n----------------------------------");
		}	
		catch(Exception e) {
		      e.getStackTrace();
	    }
	    
		//file write
		String data;
		System.out.println("\nEnter the data to be written to the file");
	    data=sc.nextLine();
	    
	    try {
	         FileWriter output = new FileWriter(filepath);
	         output.write(data);
	         System.out.println("Data is written to the file.");
	         System.out.println("----------------------------------");
	         output.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }
	    
	    //file after writing
	    System.out.println("Reading the file after writing");
		
		fh.read_file(filepath);
		System.out.println("\n----------------------------------");
	
		//appending to the file
		String append_data;
		System.out.println("\nEnter the data to be appended to the file");
	    append_data=sc.nextLine();
	    
		try {
		    FileWriter output1 = new FileWriter(filepath,true);
		    output1.write(System.getProperty( "line.separator" )+append_data);
		    System.out.println("Data is appended to the file.");
		    System.out.println("----------------------------------");
		    output1.close();
		}
		catch (Exception e) {
		    e.getStackTrace();
		}
		
		System.out.println("Reading file after appending");
		
		fh.read_file(filepath);
		
   }
}
	


