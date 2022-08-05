package Assistedprac4;
import java.util.Arrays;
public class Exponentialsearchdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,4,15,18,21,35,42};
		int length=arr.length-1;
		int key=21;
		int result = exponentialSearch(arr,length,key);
		
		if(result<0){
			System.out.println("the element is not present in the array");
			
		}
		else{
			System.out.println("the element is present in the array "+result);
		}}
public static int exponentialSearch(int[] arr ,int length, int key ){

	        if(arr[0]==key){
	            return 0;
	            }
	        int i=1;
	        while(i<length && arr[i]<=key){

	            i=i*2;
	        }
	        return Arrays.binarySearch(arr,i/2,Math.min(i,length),key);
	        }
	}


	


