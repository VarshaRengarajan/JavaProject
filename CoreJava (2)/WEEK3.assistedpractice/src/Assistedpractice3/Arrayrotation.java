package Assistedpractice3;
class RotateArray { 
public void rotate(int[] nums, int n) {
    		if(n > nums.length) 
       		n=n%nums.length;
 		int[] result = new int[nums.length];
 		for(int i=0; i < n; i++){
        			result[i] = nums[nums.length-n+i];
 		}
 		int j=0;
    		for(int i=n; i<nums.length; i++){
        			result[i] = nums[j];
        j++;
    		}
 		System.arraycopy( result, 0, nums, 0, nums.length );
}
} 
public class Arrayrotation
{
	public static void main(String[] args) {
		RotateArray r = new RotateArray();
        		int arr[] = { 3,4,6,7,8,9,12 }; 
        		r.rotate(arr, 4); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}



