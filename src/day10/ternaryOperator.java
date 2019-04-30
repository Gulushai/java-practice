package day10;

import java.util.Scanner;

public class ternaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
			int x = scan.nextInt();
			//WRITE YOUT CODE HERE
			x=(x>=5) ? x : -x;
		System.out.println(x);
			
			 System.out.println("Enter number1:");
				int num1 = scan.nextInt();
				System.out.println("Enter number2:");
				int num2 = scan.nextInt();
				//WRITE YOUR CODE HERE
				
				int value= (num1>num2) ? num1 : num2;
			System.out.println(value);
//				if (num1>num2) {
//					System.out.println(num1);
//				}else {
//					System.out.println(num2);
//				}
	}

}
