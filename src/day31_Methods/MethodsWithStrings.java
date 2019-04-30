package day31_Methods;

import java.util.Arrays;

public class MethodsWithStrings {

	public static void main(String[] args) {
		countWords("Java is fun");
		countWords("This is method with strings");
		googleSearchResults("About 121,000,000 results (0.75 seconds)");
		googleSearchResults("About 16,600,000 results (0.73 seconds)");
	}
	public static void countWords(String sentence) {
		String[] words = sentence.split(" ");
		System.out.println("Words in this sentence "+Arrays.toString(words));
		System.out.println("NUmber of words: "+words.length);
	}
	
	public static void googleSearchResults(String result) {
		String[] words = result.split(" ");
		String count = words[1].replace(",", "");
		String seconds = words[3].replace("(","");
		System.out.println("Results count: "+count);
		System.out.println("Time in seconds: "+seconds);
	}
	
	

}
