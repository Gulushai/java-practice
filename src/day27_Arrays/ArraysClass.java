package day27_Arrays;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		int[] nums = {43, 12, 22, 5, 87, 90};
		
		//toString method
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		//Sort method. sorts array in ascending method
		System.out.println();
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		String[] languages = {"Zulu", "Spanish", "Italian", "English", "Uzbek", "Latin"};
		System.out.println(Arrays.toString(languages));
		
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		
		int[] nums2 = {345, 563, 64443, 767, 2, 56};
		System.out.println();
		Arrays.sort(nums2);
		System.out.println(Arrays.toString(nums2));
		
		System.out.println();
		Arrays.sort(nums2);
		int lowest = nums2[0];
		int largest = nums2[nums2.length-1];
		System.out.println(lowest +" Lowest number");
		System.out.println(largest + " Largest number");
		
		
	}

}
