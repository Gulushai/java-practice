package day34MethodsReturn;

import java.util.Arrays;

public class MainArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(MethodArrays.getArray()));
		//get random Array from the previous class
		System.out.println();
		System.out.println("Random Array from 0 to 100");
		System.out.println(Arrays.toString(MethodArrays.getRandomArray(3)));
		int[] randomNums = MethodArrays.getRandomArray(2);
		System.out.println(Arrays.toString(randomNums));

	}

}
