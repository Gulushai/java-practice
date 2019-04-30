package day17;

import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
//	    int at = email.indexOf("@");
//	   int underscore = email.indexOf("_");
//	   int dot = email.indexOf(".");
//	   
//	    	 	if (email.contains("_")){
//	    	    	String firstName = email.substring(0, underscore);
//	    		    String lastName = email.substring(underscore+1,at);
//	    		    String gmail = email.substring(at +1, dot);
//	    		    String com = email.substring(dot+ 1);
//
//	      System.out.println(lastName+"_"+firstName+"@"+gmail+"."+com);
//	    }else {
//	    System.out.println(email); 
//	    }
	    
	    int underscore = email.indexOf('_');
	    int at = email.indexOf ('@');
	    int dot = email.indexOf ('.');
	  
	    String firstName =email.substring(0, 1).toUpperCase()+email.substring(1,underscore);
	    System.out.println("First name: "+firstName);
	    String lastName = email.substring(underscore+1, underscore+2).toUpperCase()+email.substring(underscore+1, at);
	    System.out.println("Last name: "+lastName);
	    String domain = email.substring(at+1, dot);
	    System.out.println("Domain: "+domain);
	    
	    String topLevelDomain = email.substring(dot+1);
	    System.out.println("Top-Level Domain: "+topLevelDomain);
	    
	    
	}

	private static String toUpperCase(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
