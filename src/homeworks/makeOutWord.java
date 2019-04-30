package homeworks;

import java.util.Scanner;

public class makeOutWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String out ="<<>>";
		String small = scan.next();
		String word = scan.next();
		System.out.println(out.substring(0, 2)+word+out.substring(2,4));
		System.out.println(word.substring(word.length()-2));
		
		if (word.length()>=2) {
		System.out.println(word.substring(0, 2));
		}else {
			System.out.println(word.substring(0));
		}
		
		System.out.println(word.substring(0, word.length()/2));
		
		if (small.length()>=word.length()) {
			System.out.println();
		}
		
	}
}

