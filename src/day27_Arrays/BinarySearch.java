package day27_Arrays;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] nums = {4, 6, 9, 11, 45};
		System.out.println(Arrays.binarySearch(nums, 9)); //2
		System.out.println(Arrays.binarySearch(nums, 4)); //0
		System.out.println(Arrays.binarySearch(nums, 5));//-2
		
		int i = Arrays.binarySearch(nums, 11);
		System.out.println(i); //3
		
		int[] nums2 = {40, 6, 12, 78, 100};
		Arrays.sort(nums2);
		System.out.println(Arrays.binarySearch(nums2, 40));

	}

}
