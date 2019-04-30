package homeworks;

import java.util.Scanner;

public class ShoppingListII {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			String shoppingListReport = "";
			String item = "";
			String countinue = "Yes";
			double price = 0;
			int count = 1;
			double totalProce = 0;
			do {System.out.println("Enter Item"+count+" and its price:");
				item = scan.next();
				price = scan.nextDouble();
				count+=1;
				
				shoppingListReport =shoppingListReport+"Item"+count+": "+item+" Price: "+price+", ";
				totalProce =totalProce+price;
				
				 System.out.println("Add one more item?");
				 countinue = scan.next();
					 	  
				}
			while(count<10 && countinue.equalsIgnoreCase("Yes")); 	
			shoppingListReport = shoppingListReport.substring(0,shoppingListReport.length()-2);
	System.out.println(shoppingListReport );
	System.out.println("Total price: " + totalProce);  
	}		
}		
	


	


