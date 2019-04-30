package day31_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class countUp {

	public static void main(String[] args) {
		countUp(0);
		countDown(0);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to countUp");
		int inputNum = scan.nextInt();
		countUp(inputNum);
		drive("Audi", 60);
	}
	public static void countUp(int num) {
		if(num<1) {
			System.out.println("Invalid number");
		}else {
		for(int i=1; i<=num; i++) {
			System.out.println("Numbers: "+i);
		}	
		}	
	}
	public static void countDown(int num1) {
		if(num1<1) {
			System.out.println("Invalid input");
		}else {
			for( int i=num1; i>=1; i--) {
				System.out.println("Reverse numbers: "+i);
			}
		}
	}
	public static void drive(String car, int speed) {
		
		System.out.println(car+ " drives "+speed+" mph");
	}
	
	

}
