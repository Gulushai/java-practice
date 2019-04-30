package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFindNonDuplicate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	   
	    Arrays.sort(nums);
	    System.out.print(Arrays.toString(nums));
	  
	    for(int i=0; i<=nums.length-2; i+=2) {
	    	if(nums[i]!=nums[i+1]) {
	    		System.out.println(nums[i]);
	    		return;
	    	}
	    }
	    System.out.println(nums[6]);
	    
	}

}
