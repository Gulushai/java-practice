package CodingBat;

import java.util.Scanner;

public class startOz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	String str = scan.next();
		String word = "";
		if(str.length()==0) {
			System.out.println(str);
		}else if(str.startsWith("oz")) {
			System.out.println("oz");
		}else if(str.charAt(0)=='o') {
			System.out.println("o");
		}else if(str.charAt(1)=='z') {
			System.out.println("z");
		}
		System.out.println(word);
		
		
	}

}
