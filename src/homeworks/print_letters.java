package homeworks;

import java.util.Scanner;

public class print_letters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    String AlphabeticOrder = "";
	    
	    
	    for(int i=start; i<=end; i++) {
	    	System.out.println("" + start);
	    	start++;
	    }

	}
	
	

}
