package day19WhileLoop;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("what is your current balance?");
		double amount = scan.nextDouble();
		int count = 0;
		
		while(amount>0) {
			count++;//increase transaction by 1
			System.out.println("What is your transaction "+ count+" amount?");
			double transaction = scan.nextDouble();
			if (transaction >amount) {
				System.out.println("Your balance is about to be negative due to this transaction");
			}
			amount -=transaction;
			
//			amount++;
		}
		System.out.println("Your balance is insufficient "+amount);

	}

}
