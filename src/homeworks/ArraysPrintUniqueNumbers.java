package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintUniqueNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i=0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    printUniqueNumbers(nums);
	  }
	  
	  public static void printUniqueNumbers(int[] nums){
	    //WRITE YOUR CODE HERE
	    
		  int count = 0;
		    
	    for (int j=0; j<nums.length; j++) {
	    	for(int i=0; i<nums.length; i++) {
		    	if(nums[j]==nums[i]) {
		    		count++;
		    	}
		
		    } if(count==1){
		    	System.out.println(nums[j]);
			    }count =0;
	    
	}
 }
}

