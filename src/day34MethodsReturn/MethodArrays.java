package day34MethodsReturn;

import java.util.Arrays;
import java.util.Random;

public class MethodArrays {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray()));
		System.out.println(Arrays.toString(getRandomArray(1)));

	}
	public static int[] getArray() {
		int[] nums= {3,6, 7, 4, 3, 45};
		return nums;
		}
	public static int [] getRandomArray(int size) {
		Random ran = new Random();//creating object in Random class
		int[] nums = new int [size];//declare array with size number of elements
		for(int i=0; i<size; i++) {
			nums[i]=ran.nextInt(101);//get random number and assign to array index
		}
		return nums;
	}

}
