package day29_Arrays;

import java.util.Arrays;

public class numbersMultiDimensionalArray {

	public static void main(String[] args) {
		int[][] nums = {{ 123, 532, 34, 643, -345, 73, 436, 344362, 547 },
				{ 12123, 657, 34, 56643, -567, 73, 345, 4563657, 35673576 },
				{ 22342, 343, 3453245, 34534, -567, 73, 345, 4563657,  }
					};
		//outer loop that is changing rows
		int maximum = nums[0][0];
		int minimum = nums[0][0];
		for( int rows = 0; rows<nums.length; rows++) {
			//inner loop changing column
			for(int columns =0; columns<nums[rows].length; columns++) {
				if(nums[rows][columns]>maximum) {
					maximum = nums[rows][columns];
				}
				if(nums[rows][columns]<minimum) {
					minimum = nums[rows][columns];
				}
				System.out.print(nums[rows][columns]+" | ");
			}
			
			System.out.println();
			System.out.println(Arrays.toString(nums[rows]));
		}
		System.out.println();
		System.out.println("Maximum: "+maximum);
		System.out.println("minimum: "+minimum);
		
		//int[][][] values = new int[3][2][4];
	    int[][][] values = {{{5,5},{5,5},{5,5},{5,5}}, {{7,7}, {7,7}, {7,7},{7,7}}, {{8,30}, {8,31}, {8,32}}, {{8,33}}};
	    
	    
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(values));
		
		
	}

}

