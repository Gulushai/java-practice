package day29_Arrays;

import java.util.Arrays;

public class numbers {

	public static void main(String[] args) {
		
		int[] nums = {123, 423, 545, 67};
		//get 2 value from array
		System.out.println(nums[1]);
		nums[1] = 5;
		System.out.println(Arrays.toString(nums));
		
		int max = nums[0];
		int min = nums[0];
		int counter = 0;
		for(int num : nums) {
			System.out.println("Checking " + counter+" value from array ...");
			if(num>max) {
				max=num;
			}
		}System.out.println("Maximum: " + max);
	}

}
