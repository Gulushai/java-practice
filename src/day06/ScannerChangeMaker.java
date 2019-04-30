package day06;

import java.util.Scanner;

public class ScannerChangeMaker {

	public static void main(String[] args) {
		
		int amount;
		int dollar;
		int quarter; 
		int dime;
		int nickels;
		int penney;
		
		System.out.println("Enter a whole number from 1 to 99.");
		System.out.println("I will find a combination of coins");
		System.out.println("that equals that amount of change.");
		
		Scanner keyboard = new Scanner(System.in);
		amount = keyboard.nextInt();
		
		dollar = amount;
		quarter = amount/25;
		amount = amount%25;
		dime = amount/10;
		amount = amount%10;
		nickels = amount/5; 
		amount = amount%5;
		penney = amount;
		
		System.out.println(dollar + " cents in coins can be given as:");
		System.out.println(quarter + " quarters ");
		System.out.println(dime + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(penney + " pennies");

	}

}
