package day26_Arrays;

import java.util.Arrays;

public class split {

	public static void main(String[] args) {
		String words = "java, html, python, selnium";
		String [] wordsArray = words.split(", ");
		System.out.println("count : " + wordsArray.length);
		System.out.println(wordsArray[0]);
		
		System.out.println(Arrays.toString(wordsArray));
		
		System.out.println();
		for ( String word : wordsArray) {
			System.out.println(word);
		}
		
		System.out.println();
		String diceResults = "1 - 20 of 1,461 positions";
		String[] split = diceResults.split(" ");
		System.out.println(split.length);
		
		System.out.println();
		System.out.println("Search result total: "+ split[4]);
		
		System.out.println();
		String[] split2 = diceResults.split("of");
		System.out.println(split2[0].trim());
		System.out.println(split2[1].trim());
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		
		String[] happySplit = sentence.split("happy");
		String[] allWords = sentence.split(" ");
		String[] ISplit = sentence.split("I");
		System.out.println();
		for(String w : allWords) {
			System.out.println(w);
		}
		System.out.println();
		System.out.println("After happy split");
		for(String w : happySplit) {
			System.out.println(w);
		}
		System.out.println();
		for(String w : ISplit) {
			System.out.println(w);
		}
		
		String word = "java";
		char[] charArray = word.toCharArray();
		for(char ch : charArray) {
			System.out.println(ch);
		}
	}

}
