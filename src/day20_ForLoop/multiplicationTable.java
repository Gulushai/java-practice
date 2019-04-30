package day20_ForLoop;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num>=1&&num<=10) {
			System.out.println("valid number");
		}else {
		System.out.println("Invalid number");
		return;
		}
		
		for (int i = 1; i<=10; i++) {
			System.out.println(num +" x "+ i + " = " + (num*i));
		}
			
		

	}

}
