package day30_methods;

import java.util.Scanner;

public class methods {

	public static void main(String[] args) {
		print5stars();
		//call print5stars 100 times
		for( int i=0; i<=100; i++) {
			print5stars();
		}
		introduce();
	}
	
	public static void print5stars() {
		System.out.println("*****");
	}
	public static void introduce() {
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = scan.next();
	System.out.println("Nice to meet you, "+name);
		
	}
	
	

}
