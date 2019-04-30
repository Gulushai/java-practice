package day16_String_Manipulation;

import java.util.Scanner;

public class replace {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		System.out.println("Type words: ");
//		
//		String words = scan.nextLine();
//		
//		System.out.println(words.replace("a", "y"));
//		System.out.println(words.replace("sad", "happy"));
//		System.out.println(words.replaceFirst(" ", "|"));
		
		String sentence = "Coding is fun, it is my hobby";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		
		System.out.println(sentence);
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
		
		String mixed = "@$#%%$*j^%a^v*a";
		//clean up mixed
		mixed = mixed.replace("@$#%","");
		System.out.println(mixed);
		mixed = mixed.replace("%$*", "");
		System.out.println(mixed);
		mixed = mixed.replace("^%","");
		System.out.println(mixed);
		mixed =mixed.replace("^","");
		mixed =mixed.replace("*","");
		System.out.println(mixed);
		
		String result = "About 25,700,000 (0,71 sec.)";
		result=result.substring(result.indexOf("2"),result.indexOf("("));
		//result = result.replace("About","");
		System.out.println(result);
		result = result.replace(",", "");
		System.out.println(result);
	}

}
