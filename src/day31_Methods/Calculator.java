package day31_Methods;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println("Select operation: '+', '-', '/', '*', '%'");
		String operator = scan.next();
		add(num1, num2);
		subtract(num1, num2);
		multiply(num1, num2);
		divide(num1, num2);
		remainder(num1, num2);
		
		switch (operator) {
		case "+":
			add(num1,num2);
			break;
		case "-":
			subtract(num1,num2);
			break;
		case "*":
			multiply(num1,num2);
			break;
		case "/":
			divide(num1,num2);
			break;
		case "%":
			remainder(num1,num2);
			break;
			default:
			System.out.println("Invalid number");
		}
	}
	public static void add(double num1, double num2) {
		double result = num1+num2;
		System.out.println("Result add: "+result);
	}
	public static void subtract(double num1, double num2) {
		double result = num1-num2;
		System.out.println("Result subtract: "+result);
	}
	public static void multiply(double num1, double num2) {
		double result = num1*num2;
		System.out.println("Result multiply: "+result);
	}
	public static void divide(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("Invalid input. Cannot / by 0");
			return;
		}
		double result = num1/num2;
		System.out.println("Result divide: "+result);
	}
	public static void remainder(double num1, double num2) {
		double result = num1%num2;
		System.out.println("Result remainder: "+result);
	}

}
