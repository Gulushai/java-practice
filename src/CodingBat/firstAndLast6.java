package CodingBat;

import java.util.Arrays;

public class firstAndLast6 {

	public static void main(String[] args) {
		int[] nums = {10, 20, 5, 8, 12, 65};
		
		System.out.println(firstLast6(nums));
		System.out.println(Arrays.toString(nums));
		System.out.println("*************");
		System.out.println(Arrays.toString(arr(nums)));
	}
	public static boolean firstLast6(int[] nums) {
		if((nums[0]==6)||(nums[nums.length-1]==6)){
		    return true;
		  }return false;
	}
	public static int[] arr(int[] numbers) {
		return numbers;
	}

}
