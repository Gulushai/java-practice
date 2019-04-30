package day10;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item1, item2, item3, report;
	    double price1, price2, price3, totalPrice;
	    int count1, count2, count3;
	    Scanner scan = new Scanner (System.in);
	    
	    System.out.println("Enter Item1, count and its price:");
	    item1 = scan.next();
	    count1 = scan.nextInt();
	    price1 = scan.nextDouble();
	    
	    System.out.println("Enter Item2, count and its price:");
	    item2 = scan.next();
	    count2 = scan.nextInt();
	    price2 = scan.nextDouble();
	    
	    System.out.println("Enter Item3, count and its price:");
	    item3 = scan.next();
	    count3 = scan.nextInt();
	    price3 = scan.nextDouble(); 
	    
	    totalPrice=(price1*count1)+(price2*count2)+(price3*count3);
	    
	    if (count1==0) {
	      System.out.println("Item2: "+item2 +" Price: "+(price2*count2)+ ", "+"Item3: "+item3 +" Price: "+(price3*count3));
	    } 
	    if (count2==0) {
	      System.out.println("Item1: "+item1 +" Price: "+(price1*count1)+ ", "+ "Item3: "+item3 +" Price: "+(price3*count3));
	    }
	    if(count3==0) {
	      System.out.println("Item1: "+item1 +" Price: "+(price1*count1)+ ", "+"Item2: "+item2 +" Price: "+(price2*count2));
	    }
	   
	   System.out.println("Total Price: "+totalPrice);
	    
	}

}
