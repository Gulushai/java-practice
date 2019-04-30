package day13;

import java.util.Scanner;

public class mediumNumber {

	public static void main(String[] args) {
		 Scanner cl= new Scanner(System.in);
		    int num1, num2, num3;
		    
		    System.out.println("Enter first number:");
		    num1=cl.nextInt();
		    System.out.println("Enter second number:");
		    num2=cl.nextInt();
		    System.out.println("Enter third number:");
		    num3=cl.nextInt();
		    if((num1<=num2&&num2<=num3)||(num1>=num2&&num2>=num3)){
		    	System.out.println("Medium value is: " +num2);
		    
		    }else if((num2<=num1&&num1<=num3)||(num2>=num1&&num1>=num3)){
		      System.out.println("Medium value is: " +num1);
		      
		    }else{
		      System.out.println("Medium value is: " +num3);
		      return;
		    }

	}

}
