package day22Loops;

import java.util.Scanner;

public class numbersWarmUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month");
		int month = 0;
		
		do {
			month = scan.nextInt();
			System.out.println(month);
		}
		while(month<=12 && month>=0);
		
		System.out.println("Invalid month");

	}

}
