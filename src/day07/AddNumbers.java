package day07;
import java.util.Scanner;
public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    
		    String item1, item2, item3, report;
		    
		    double price1, price2, price3, totalPrice;
		    
		    Scanner scan = new Scanner(System.in);
		    
		    item1 = scan.next();
		    price1 = scan.nextDouble();
		    System.out.println("Enter\"" + item1 + "\"and its\"" + price1 + "\"");
		    
		    item2 = scan.next();
		    price2= scan.nextDouble();
		    System.out.println("Enter\"" + item2 + "\"and its\"" + price2 +"\"");
		    
		    item3 = scan.next();
		    price3 = scan.nextDouble();
		    System.out.println("Enter\"" + item3 + "\" and its\"" + price3+ "\"");
		   
		    
		    totalPrice = price1 +price2 + price3;
		    report = "Item1: " +item1+" Price " + price1; 
		    report = "Item2: "+ item2+ " Price: " +price2; 
		    report = " Item3: " + item3+" Price3: "+price3;
//		    totalPrice = "Total price: " +totalPrice;
//		    scan = report.next();
//		    scan = totalPrice.nextDouble();
		    System.out.println(report);
		    System.out.println(totalPrice);
	}

}
