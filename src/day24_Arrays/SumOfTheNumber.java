package day24_Arrays;

import java.util.Arrays;

public class SumOfTheNumber {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		numbers[0] = 25;
		numbers[1] =10;
		numbers[2] = 20;
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		int sum =0;
		
		//use for loop, in order to loop through the array
		//calculate sum of all elements
		for(int i= 0; i< numbers.length; i++) {
			sum = sum+numbers[i];
		}
		System.out.println("Sum: "+sum);
		
		//find the biggest value in the array
		int max = Integer.MIN_VALUE;
		System.out.println(Integer.MIN_VALUE);
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}
		}
		System.out.println("Max value: "+max);
		
		//Find the min value in the array
		int min =Integer.MAX_VALUE;
		for (int k=0; k<numbers.length; k++) {
			if(numbers[k]<min) {
				min = numbers[k];
			}
		}
		System.out.println("Min value: "+min);
		
	}

}
