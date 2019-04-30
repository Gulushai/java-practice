package homeworks;

import java.util.Scanner;

public class BuildARout {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	    if (start.equals(end)) {
	    	System.out.println(end+" found");
	    }else {
	    	while(!(start.equalsIgnoreCase(end))) {
	    		if(start.equalsIgnoreCase("A")) {
	    			System.out.print("right");
	    			start = "B";
	    		}else if(start.equalsIgnoreCase("B")) {
	    			System.out.print("down");
	    			start = "C";
	    		}else if(start.equalsIgnoreCase("C")) {
	    			System.out.print("left");
	    			start = "D";
	    		}else if(start.equalsIgnoreCase("D")) {
	    			System.out.print("up");
	    			start = "A";
	    	}
	    		if (start.equalsIgnoreCase(end)) {
	    			System.out.print(": "+ end + " found");
	    		}else {
	    			System.out.print(" > ");
	    		}
	    	}
	    }
	}
}
//	String result="";
//	 
//    String trip = "A right > B down > C left > D up > A rigth > B down > C left > D up > A";
//    
//    if (start.equals(end)) {
//    	System.out.println(end+" found");
//    }else {
//    	result = trip.replace("B", "").replace("C", "");
//    	System.out.println(start.substring(0, trip.indexOf("D"))+1);
//    	}else {
//    		result = trip.replace(, trip);
//    		System.out.println(start.substring(0, ));
//    	}
    
    
	

