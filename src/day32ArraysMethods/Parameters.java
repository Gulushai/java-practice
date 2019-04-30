package day32ArraysMethods;

import java.util.Arrays;

public class Parameters {

	public static void main(String[] args) {
		int[] myArray = {44, 55, 32, 1};
		printArray(myArray);
		printArray(new int[]{21, 43, 2, 5, 65});
		int[] one = {6, 4, 1};
		int[] two = {9, 3, 7, 9};
		print2Arrays(one, two);
		print2ArraysV2(one, two);
	}
	public static void printArray(int[] nums) {
		for ( int n : nums) {
		System.out.println(n+" ");
		}
		System.out.println();
	}
	
	public static void print2Arrays(int[] num1, int[] num2) {
		if(num1.length>num2.length) {
			System.out.print(Arrays.toString(num1));
			System.out.print(Arrays.toString(num2));
		}else {
			System.out.print(Arrays.toString(num2));
			System.out.print(Arrays.toString(num1));
		}
	}
		public static void print2ArraysV2(int[] num1, int[] num2) {
			if(num1.length>num2.length) {
				printArray(num1);
				printArray(num2);
			}else {
				printArray(num2);
				printArray(num1);
				
			}
			
		
//		for(int i=0; i<num1; i++) {
//			if(num1[i]>num2[]);
//			
//		}
//		for (int j=0; j<num2; j++) {
//			if(num2[j]>num1[i]);
//		}
	}
	

}
