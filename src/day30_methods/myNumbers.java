package day30_methods;

import java.util.Random;
import java.util.Scanner;

public class myNumbers {

	public static void main(String[] args) {
		doPush10Ups();
		showMe5Numbers();
		rangePrint();
	}
	
	public static void showMe5Numbers() {
		Random random = new Random();
		for(int i=1; i<=5; i++) {
			System.out.print(random.nextInt(1001)+ " ");
		}
		System.out.println();
	}
	public static void doPush10Ups() {
		for (int i =1; i<=10; i++) {
			System.out.println("Push Ups "+ i);
		}
		System.out.println("Time to rest");
	}
	
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 nums");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1<num2) {
		for(int i=num1; i<=num2; i++) {
			
				System.out.print(i + " ");
			}
		}else if(num1>num2) {
			for( int j=num1; j>=num2; j--) {
				System.out.print(j +" ");
			}
			
		}else {
			System.out.println(num1);
		}
		
	}
	

}
