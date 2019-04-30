package homeworks;

import java.util.Scanner;

public class ArrayFirstLastChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    //TODO: Write your code below
	    
	    String str="";
	    for(int i=0; i<words.length; i++) {
	    	
	    	str +=words[i].charAt(0)+""+ words[i].charAt(words[i].length()-1)+", ";
	    	
	    }
	    String str1 = str.substring(0, str.length()-2);
	    System.out.println("[" +str1 + "]");
	    	
}
}
