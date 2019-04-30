package homeworks;

import java.util.Scanner;

public class FirstAndLastCh {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    for(String first : words) {
	    	System.out.print(first.substring(0, 1));
	    	System.out.println(first.substring(first.length()-1, first.length()));
	    }
	}

}
