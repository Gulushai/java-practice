package day11_nestedif;

import java.util.Scanner;

public class validUsername {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String username = scan.nextLine();
		String password = scan.nextLine();
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successful Welcome");
		}
		else if(!username.equals(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid Username and Invalid Password");
		}
		else if(username.equals(validUsername) &&  !password.equals(validPassword)) {
			System.out.println("Invalid Password");
		}
		if(!username.equals(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid Username");
		}
		
		

	}

}
