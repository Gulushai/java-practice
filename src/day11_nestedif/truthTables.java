package day11_nestedif;

import java.util.Scanner;

public class truthTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Truch table for && operator");
//		System.out.println("When true && true - result is " +(true && true));
//		System.out.println("When true && false - relsult is " + (true && false));
//		System.out.println("When false && true - result is " + (false && true));
//		System.out.println("When false && false - result is " + (false && false));
//		
//		System.out.println(); //add an empty line
//		
//		System.out.println("Truth table for || operator");
//		System.out.println("When true || true - result is " + (true || true));
//		System.out.println("When true || false - result is " + (true || false));
//		System.out.println("When false || false - result is " + (false || false));
//		System.out.println("When false || true - result is "+ (false || true));
//		
//		System.out.println();
//		
//		System.out.println("Truth table for ! (Not operator)");
//		System.out.println("When !true - result is " + (!true));
//		System.out.println("When !false - result is " + (!false));

		Scanner scan = new Scanner(System.in);
	System.out.println("Enter age:");
		int age = scan.nextInt();
		if(age<2 || age >18) {
			System.out.println("Ineligible");
		}else if (age ==2) {
			System.out.println("Toddler");
		}else if (age>3 && age<5) {
			System.out.println("Early childhood");
		}else if (age>6 && age<7) {
			System.out.println("young reader");
		}else if (age>8 && age<10) {
			System.out.println("elementary");
		}else if (age>11 && age<12) {
			System.out.println("middle");
		}else if (age ==13){
			System.out.println("impossible");
		}else if (age>14 && age<16 ) {
			System.out.println("high school");
		}else if (age>=17 || age<=18) {
			System.out.println("scholar");
		}
		
	}

}
