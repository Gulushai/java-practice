package day16_String_Manipulation;

import java.util.Scanner;

public class GetNumberFromString {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String sentence = "I wrote [234] lines of code today";
		int start= sentence.indexOf('[')+1;
		int end = sentence.indexOf(']');
		System.out.println(sentence.substring(8,14));
		System.out.println(sentence.substring(start, end));
		String codeCount = sentence.substring(start, end);
		
		int count = Integer.parseInt(codeCount);
		if(count>300) {
			System.out.println("Wrote more than 20 lines of code today");
		}else {
			System.out.println("Not enough coding for today");
		}
		
		//System.out.println(sentence.substring(sentence.indexOf('[')+1,sentence.indexOf('[')));

	}

}
