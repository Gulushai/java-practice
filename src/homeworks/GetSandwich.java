package homeworks;

import java.util.Scanner;

public class GetSandwich {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     int count =0;
	     str.replaceFirst("bread", "!");
	     
	     for(int i=0; i<str.length(); i++) {
	    	 if(str.charAt(i)=='!');
	    		 count ++;
	    	 {
	    		 if(count ==2) {
	    		    	str = str.substring(str.indexOf("!")+1, str.lastIndexOf("!"));
	    		    	System.out.println(str);
//	    		    }else if( count>2) {
//	    		    	str = str.substring(str.indexOf("$")+1, str.lastIndexOf("$"));
//	    		    	str = str.replace("$", "bread");
//	    		    	System.out.println(str);
	    		    } else{
	    		    	 System.out.println("nothing");
	    		     }
	    		    	 }
	    		     }
	 }
	}


