package day27_Arrays;

import java.util.Arrays;

public class copyOf2 {

	public static void main(String[] args) {
		
		//also add 2 more spaces
		int[] nums1 = {34, 432, 54, 222, 70, 1};
		int[] nums2 = Arrays.copyOf(nums1, nums1.length+2);
		
		System.out.println(Arrays.toString(nums2));

		nums2[5] = 100;
		nums2[6] = 200;
		System.out.println(Arrays.toString(nums2));
		
		int [] brandNew = {34, 432, 54, 222, 70, 1};
		System.out.println("Length before: "+ brandNew.length);
		brandNew = Arrays.copyOf(brandNew, brandNew.length+5);
		System.out.println("Length after: "+ brandNew.length);
		
		
	}

}
