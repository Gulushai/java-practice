package day21_LoopPractice;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many items he purchased?");
		int totalItems = scan.nextInt();
		double totalPrice = 0.0;
		String ItemList = "";
		
		for(int count=1; count<=totalItems; count++) {
			System.out.println("Name of the "+count+ " Item");
			String itemName =scan.next();
			
			System.out.println("Price of the purchase");
			double itemPrice = scan.nextDouble();
			
			ItemList = ItemList +itemName+ ", ";
			totalPrice +=itemPrice;
			
		}
		if(ItemList.endsWith(", ")) {
			// get rid of that,
			ItemList = ItemList.substring(0,ItemList.length()-2);
		}
		System.out.println("your items: "+ ItemList);
		System.out.println("your total price: $"+totalPrice);
		

	}

}
