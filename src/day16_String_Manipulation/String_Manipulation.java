package day16_String_Manipulation;

import java.util.Scanner;

public class String_Manipulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url");
		String url = scan.next();
		
		int dot = url.length()-4;
		String domain = url.substring(4,dot);
		String extension = url.substring(dot+1, url.length());
//		url = "www.amazon.com";
		if (url.startsWith("www.")) {
		System.out.println("www. is present");
		}else {
			System.out.println("Invalid url format");
			return;
		}
		if (url.charAt(dot)=='.') {
		System.out.println("Yes it contains .com ");
		}else {
			System.out.println(". might be misplaced");
		}
		
		System.out.println(domain);
		System.out.println(extension);

	}

}
