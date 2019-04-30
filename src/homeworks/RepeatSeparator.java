package homeworks;

import java.util.Scanner;

public class RepeatSeparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    String allWords = "";
	    
	    for(int i =1; i<=count; i++) {
	    	
	    	if(i<count) {
	    		allWords +=word+separator;
	    	}else {
	    		allWords +=word;
	    		} 
	    
	    }
	    	
	   	System.out.println(allWords);
	    
	}

}
