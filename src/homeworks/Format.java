package homeworks;

import java.util.Scanner;

import day14_String.Words;

public class Format {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "three  two    one";

//		System.out.println(str.replace(" ","  "));

		String word1, word2, word3;
		int a = str.indexOf(" ");
	    word1 = str.substring(0, a);
	    System.out.println(word1);
	    int b = str.lastIndexOf(" ");
	    word3 = str.substring(b+1);
	    System.out.println(word3);
	    word2 = str.substring(a,b).trim();
	    System.out.println(word2);
	    System.out.println(word1+"  "+word2+"  "+word3);
		//word3 = str.substring(str.indexOf(" ") + 1);
		//System.out.println(word3);
		//System.out.println(word1 + "" + word2 + "" + word3);
	    
	    
	}

}
