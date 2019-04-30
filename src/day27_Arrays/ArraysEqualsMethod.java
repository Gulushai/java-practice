package day27_Arrays;

import java.util.Arrays;

public class ArraysEqualsMethod {

	public static void main(String[] args) {
		
		int[]nums1 = {4, 7, 13, 65, 100};
		int[]nums2 = {4, 7, 13, 65, 100};
		System.out.println(Arrays.equals(nums1, nums2));
		
		if(Arrays.equals(nums1, nums2)) {
			System.out.println("They are exactly same");
		} else {
			System.out.println("Mismatched values present");
		}
		String[] strArray1 = {"one", "two", "three", "four"};
		String[] strArray2 = {"One", "two", "three", "four"};
		System.out.println(Arrays.equals(strArray1, strArray2));
		
		boolean match = Arrays.equals(strArray1, strArray2);
		System.out.println(match);
		
	}

}
