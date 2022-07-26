package Project2;
import java.util.ArrayList;
import java.util.Scanner;

public class Emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        ArrayList<String> emailList = new ArrayList<String>();
        
        emailList.add("sej@shg.com");
        emailList.add("raj@gmail.com");
        emailList.add("sai34@yahoo.com");
        emailList.add("ran2@dh.com");
        emailList.add("meena@google.com");
        emailList.add("thenu@gg.com");
        emailList.add("Vars45@yahoo.com");
        emailList.add("paartha22@gmail.com");
        
        String userEmail;
        System.out.println("Enter the email to search:");
        
           userEmail = sc.nextLine(); 
		
        if(emailList.contains(userEmail)){
            	System.out.println("email ID " + userEmail + " is present in the list");
        }
        else{
         System.out.println( "email ID " + userEmail + " not in the list");
        }

       
   }

}

	


