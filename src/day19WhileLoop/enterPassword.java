package day19WhileLoop;

import java.util.Scanner;

public class enterPassword {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in);
		String password = "abc123";
		String input;
		do {
			System.out.println("Enter password");
			input = scan.next();
		}while (!input.equals(password));//if input is not same as password, keep asking for password
//		System.out.println(true);
	}

}
