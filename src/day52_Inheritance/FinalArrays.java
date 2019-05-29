package day52_Inheritance;

import java.util.Arrays;

public class FinalArrays {

	public static void main(String[] args) {
		final int[] TEAMS = new int[]{11,22};
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		
		TEAMS[0] =10;
		TEAMS[1] =9;
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		
		//TEAMS = new int[3];
		
		int[] nums = new int[] {23, 55, 11};
		System.out.println(Arrays.toString(nums));
		
		nums = new int[] {2434, 54223, 2, 345, 32};
		System.out.println(Arrays.toString(nums));
		
		final int[] finalNums = {34, 541, 132, 43, 13};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 333;
		final int i = 100;
		finalNums[1] = i;
		finalNums[1] = 2222;
		System.out.println(Arrays.toString(finalNums));
		
		//finalNums = new int[] {23, 42, 12, 122};
		
		final double[] PRICES = new double[3];
		PRICES[0] = 222.2;
		PRICES[1] = 1111;
		PRICES[2] = 4444;
		System.out.println(Arrays.toString(PRICES));
		
		PRICES[0] = 21.9;
		System.out.println(Arrays.toString(PRICES));
		//PRICES = new double[3];
		
	}

}
