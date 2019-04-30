package day19WhileLoop;

import java.util.Scanner;

public class Polindron {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test: ");
		String word = scan.next();
		String reversed = "";
		//loop through word in order and
		//concatenate each character to reversed string
		int i = word.length()-1;
		while (i>=0) {
			reversed = reversed+word.charAt(i);
			i--;	
		}
		System.out.println(reversed);
		
		//compare if word and reversed are equal
if(reversed.equalsIgnoreCase(word)) {
	System.out.println("It is palindrome");
}else {
	System.out.println("It is not");
}
	}

}
