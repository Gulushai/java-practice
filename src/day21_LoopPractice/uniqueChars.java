package day21_LoopPractice;

import java.util.Scanner;

public class uniqueChars {

	public static void main(String[] args) {
		String word = "javva";
		String unique = "";
		
		char ch = word.charAt(3);
		System.out.println(unique.contains(""+ch));
		if(!unique.contains(""+ch)) {
			unique +=ch;
		}
		System.out.println("unique:" + unique);
		
		String word2 = "bananas";
		String unique2 = "";
		
		int i =0;
		char ch2 =word2.charAt(i); //b
		System.out.println("Ch2:"+ch2);
		
		i = 1;
		ch2 = word2.charAt(i); //a
		System.out.println("Ch2:"+ch2);
		
		i++;
		ch2 = word2.charAt(i);//n
		System.out.println("Ch2:"+ch2);
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter word");
		String str = scan.next();
		String un = "";
//		for(int j = 0; j<str.length(); j++) {
//			//System.out.println(j);//output is numbers 0123 for java
//			System.out.println(str.charAt(j));
//			
			for (int h=0; h<str.length(); h++);
			int h=0;
			//read the letter and assign
			char letter = str.charAt(h);
			//System.out.println(letter);
			
			if(!unique2.contains(""+letter)) {
				unique2 +=letter;//add to unique
				System.out.println(letter);
		}
			System.out.println(unique2);
	}
	
}
