package CodingBat;

import java.util.Scanner;

public class missingChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String first = "";
		String last = "";
		int i = 2;
		
		first = str.substring(0, i);
		last = str.substring(i+1, str.length());
		
		System.out.println(first+last);
	}

}
