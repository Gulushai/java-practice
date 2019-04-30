package homeworks;

import java.util.Scanner;

public class ParseJSON {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		
		//json.indexOf("firstName")+13 it mean to find a first name 
		// then +13 means shift to the right by 13 characters
		
		String firstName = json.substring(json.indexOf("firstName")+13, json.indexOf("\","));
			
		String lastName = json.substring(json.indexOf("lastName")+12, json.indexOf("\", \"role\""));
		
		System.out.println("First Name "+ firstName);
		System.out.println("Last Name "+ lastName);
		

	}

}
