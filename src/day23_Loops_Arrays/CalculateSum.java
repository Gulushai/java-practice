package day23_Loops_Arrays;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		// lets write a program
		// that will calculate a sum of 6 numbers
		Scanner scan = new Scanner(System.in);
		int sum =0;
		for(int i =0; i<6; i++) {
			System.out.println("Enter a number");
			int number =scan.nextInt();
			if(number<=0) {
				continue;
			}
			sum +=number;
		}
		System.out.println("Total sum: "+sum);

	}

}
