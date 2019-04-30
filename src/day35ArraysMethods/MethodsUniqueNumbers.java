package day35ArraysMethods;

import java.util.Arrays;

public class MethodsUniqueNumbers {

	public static void main(String... args) {
		int[] nums = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };
		System.out.println(Arrays.toString(nums));

		findUnique(nums);
		int[] arr= {4,3,4,2,5,4,7};
		
		findUnique(arr);
		int[] unique = getUnique(arr);
		System.out.println(Arrays.toString(unique));
		
		int[] cheapUnique = getUniqueArrayCheap(arr);
		System.out.println(Arrays.toString(cheapUnique));
	}
		
		public static void findUnique(int[] nums) {
			for (int i = 0; i < nums.length; i++) {
				int count = 0;
				for (int j = 0; j < nums.length; j++) {
					if (nums[i] == nums[j] && i != j) {
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.println(nums[i]);
				}
			}
		}
		//declare empty string 
		//find unique numbers and add to that string
		//split that string by space
		//declare new int[] and assign each number from split
		//return the int[] array
 		public static int[] getUniqueArrayCheap(int[]nums) {
 			// declare empty string
 			String unique = "";
			for (int i = 0; i < nums.length; i++) {
				int count =0;
				int temp = nums[i];
				for (int j = 0; j < nums.length; j++) {
					if (temp == nums[j] && i != j) {
						count++;
						break;
					}
				}
				if (count == 0) {
					
					//find unique numbers and add to that string
					unique +=" "+ temp;
					
				}
			}
			//split that string by space
			String[] strArray = unique.trim().split(" ");
			//declare new int[] and assign each number from split
			int[] uniqueArr = new int[strArray.length];
			for(int k=0; k<strArray.length; k++) {
				uniqueArr[k] = Integer.parseInt(strArray[k]);
			}
			//return the int[] array
			return uniqueArr;
		}
		//find out how many unique numbers
		//declare with that size
		//and loop through again and assign numbers, then return the array
		
		public static int[] getUnique(int[] nums) {
			//find out how many unique numbers
			int uniqueCount = 0;
			for (int i = 0; i < nums.length; i++) {
				int count =0;
				for (int j = 0; j < nums.length; j++) {
					if (nums[i] == nums[j] && i != j) {
						count++;
						break;
					}
				}
				if (count == 0) {
					uniqueCount ++;
				}
			}
			//declare new array with that size
			int[] uniqueArray = new int[uniqueCount];
			int idx = 0;
			for (int i = 0; i < nums.length; i++) {
				int count =0;
				int temp = nums[i];
				for (int j = 0; j < nums.length; j++) {
					if (temp == nums[j] && i != j) {
						count++;
						break;
					}
				}
				if (count == 0) {
					uniqueArray[idx] = temp;
					idx++;
				}
			} return uniqueArray;
		}
}
