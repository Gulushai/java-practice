package day24_Arrays;

import java.util.Arrays;

public class lotteryTicket {

	public static void main(String[] args) {
		int[] lotteryNumbers = {12, 33, 43, 24, 54, 23, 34};
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		//binary search works only with sorted array
		
		int index = Arrays.binarySearch(lotteryNumbers, 54);
		System.out.println("Position: "+index);
		//if value doesn't exist
		int index2 = Arrays.binarySearch(lotteryNumbers, 60);
		System.out.println("Position: "+index2);
	}

}
