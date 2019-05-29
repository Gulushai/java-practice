package day35ArraysMethods;

import java.util.Arrays;

public class addArrays {

	public static void main(String[] args) {
		int[] nums1 = {10, 20, 5, 8, 12, 65};
		int[] nums2 = {5, 1, 45, 4, 16, 29};
		
		int[] newArray = add2Arrays(nums1, nums2); 
		System.out.println("nums1: "+Arrays.toString(nums1));
		System.out.println("nums2: "+Arrays.toString(nums2));
		System.out.println("nums3: "+Arrays.toString(newArray));
		
		
		String[] first = {"apple","pear","grapes","berries"};
		String[] second = {"zuchini","onion","tomato","cabbage"};
		String[] newArray1 = add2Arrays(first, second);
		System.out.println("string: "+Arrays.toString(newArray1));

	}
	
	public static int[] add2Arrays(int[] nums1, int[] nums2) {
		int[] nums3 = new int[nums1.length];
		
		for(int i =0; i<nums1.length; i++) {
			nums3[i] = nums1[i]+nums2[i];
		}		
		
		return nums3;
	}
	//METHOD OVERLODAING - same name but different parameters
	
	public static String[] add2Arrays(String[] str1, String[] str2) {
		String[] newOne = new String[str1.length];

		
		for(int i=0; i<str1.length; i++) {
			newOne[i] =str1[i]+"-"+str2[i];
			
		}
		return newOne;
	}
	
}
