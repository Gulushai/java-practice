package day23_Loops_Arrays;

import java.util.Scanner;

public class SixWords {

	public static void main(String[] args) {
		// Program that will take from user 6 words, concatenate words with a comma.
		// If word is equal to java skip this word 
		// Print summary at the end of the word
		
		Scanner scan = new Scanner(System.in);
		
		String AllWords = "";
		String word ="";
		for(int i=1; i<=3; i++) {
			System.out.println("Print the words");
			word = scan.next();
		if(word.equalsIgnoreCase("Java")) {
			continue;
		}
		AllWords+=word +", ";
	}
		System.out.println(AllWords.substring(0, AllWords.length()-2));
}
}
