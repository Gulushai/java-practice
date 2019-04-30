package day06;

import java.util.Scanner;

public class EnterNumber {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in); //create Scanner object
//		System.out.println("ENter a number:");
//		
//		int number = input.nextInt();
//		System.out.println("You entered " + number);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String firstName = scan.next();
		System.out.println("My name is: " + firstName);

	}

}
