package Assistedprac4;
import java.util.Scanner;
public class Linearsearchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many values:");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter the " +n+ " values:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int target=sc.nextInt();
		int pos=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				pos=i;
				break;
			}
			
		}
		if(pos!=-1){
			System.out.println("The element is found at position " +(pos+1));
		}
		else{
			System.out.println("The element is not found here");
		}

	}

}
