package day26_Arrays;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		if(age>0 && age<21) {
			System.out.println("Underage!");
		}else if(age<1){
			System.out.println("Invalid age!");
		}else {
			System.out.println("You are fine!");
		}
		
		int time =20;
		//condition ? if true : if false
		System.out.println(time < 18 ? "Good afternoon" : "Good evening");
	}
}
