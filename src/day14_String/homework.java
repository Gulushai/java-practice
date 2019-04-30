package day14_String;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE 
		 System.out.println("Enter full name:");
		    String user = scan.next();
		   
		    if (user.equals("Max Payne") && user.equals("Alan Wake")) {
		    	System.out.println("User not found!");	   
		    	
		    }else if(!user.equals("Max Payne") && user.equals("Alan Wake")){
		      System.out.println("User found!");
		      
		    }else {
		    	System.out.println("User not found!");
		    }

	}

}
