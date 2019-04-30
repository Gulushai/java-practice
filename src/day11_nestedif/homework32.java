package day11_nestedif;

import java.util.Scanner;

public class homework32 {

	public static void main(String[] args) {
		
//		Scanner scan=new Scanner(System.in);
//		int dollar, quarters, dimes, nickels;
//	  	System.out.println("Enter price in cents:");
//	  	int itemPrice= scan.nextInt();
//       
//	  	if(itemPrice<100 && itemPrice>25 && itemPrice %5==0){
//		     int value = 100 - itemPrice;
//		    	quarters = value/25; 
//				 value = value%25;
//				 dimes = value/10;
//				 value =value%10;
//				 nickels = value;
//				 
//				 
//System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and "+ nickels+" nickels.");
//			    
//			    }else {
//			      System.out.println("Invalid price!");
//			    }
//			    
//		 Scanner s = new Scanner(System.in);
//		 int coupons, candy, gumballs;
//		 System.out.println("Enter number of coupons:");
//		 coupons=s.nextInt();
//		   if () {
//		    candy = coupons/10;
//		    coupons %=10;
//		    gumballs = coupons/3;
//		    coupons %=3;
//		    System.out.println("Number of Candies: "+candy);
//		    System.out.println("Number of Gumballs: "+gumballs);
//		   }else {
//			   System.out.println("Not enough coupons");
//		   }
//		Scanner input = new Scanner(System.in);
//	    System.out.println("Enter 2 numbers:");
//	    int num1 = input.nextInt();
//	    int num2 = input.nextInt();
//	    //CODE HERE 
//	    if (num1==num2){
//	      System.out.println(num1+" and "+num2+" are equal");
//	    }
//	    if (num1>num2){
//	      System.out.println(num1+" is greater than "+num2);
//	    }
//	    if (num1<num2){
//	      System.out.println(num2+" is greater than "+num1);
//	    }
	    
		Scanner s = new Scanner(System.in);
		   int vehicleYear;
		   System.out.println("Enter vehicle's year:");
		   vehicleYear = s.nextInt();
		   if (vehicleYear>=1995&&vehicleYear<=1998) {
			   System.out.println("Your vehicle needs to be recalled!");
		   }else if(vehicleYear>=2001&&vehicleYear<=2002) {
			   System.out.println("Your vehicle needs to be recalled!");
		   }else if(vehicleYear>=2004&&vehicleYear<=2006) {
			   System.out.println("Your vehicle needs to be recalled!");
		   }else if (vehicleYear>=2015&&vehicleYear<=2017) {
			   System.out.println();
		     
		   }else{
		     System.out.println("Your vehicle is fine, enjoy!");
		   }
	  
		  
		    
		    
	}

}
