package day23_Loops_Arrays;

import java.util.Scanner;

public class Array_splitEmail {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    int count = 0;
	    for(int i=0; i<email.length(); i++) {
	    	  if(email.charAt(i)=='@') {
	    		  count++;
	    	  }
	    }
	    
	    if(count ==1) {
	    	 String[] emailArray = email.split("@");
	 	    for(String arr : emailArray) {
	 	    	
	 	    System.out.println("Email id: "+emailArray[0]);
	 	    System.out.println("Email domain: "+emailArray[1]);
	 	    break;
	 	    							}
	 	    		}else {
	 	    		System.out.println("Invalid email");
	    }
	  
	   
	    	
	    

	}

}
