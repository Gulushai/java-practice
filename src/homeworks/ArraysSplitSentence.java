package homeworks;

import java.util.Scanner;

public class ArraysSplitSentence {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    //type your code below
		    String[] words = sentence.split(" ");
		    
		    for(String a : words) {
		    	System.out.println(a);
		    } 
	}

}
