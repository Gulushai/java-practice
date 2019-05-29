package homeworks;

import java.util.Arrays;

public class MethodsWithArrays3SwitchElements {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(do_switch(nums)));
	}
	public static int[] do_switch(int[] nums) 
	 {
	   int templ = nums[0];
		nums[0]= nums[nums.length-1];
		 nums[nums.length-1]=templ ;
		return nums;
	   }
		

}
