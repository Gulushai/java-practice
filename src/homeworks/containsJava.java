package homeworks;

import java.util.Scanner;

public class containsJava {

	public static void main(String[] args) {
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    if(word.contains("java")){
	    	word =word.replace("java", "#");
	    	if(word.indexOf("#")<=1) {
	    		exists=true;
	    		System.out.println(exists);
	    	}else
	    		System.out.println(exists);
	    }

	}

}
