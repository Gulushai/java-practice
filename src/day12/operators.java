package day12;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1 = s.nextDouble();
		System.out.println("Enter second number:");
		double num2 = s.nextDouble();
		
		//get operator
//		System.out.println("Select Operator: +, -, *, /, %");
		String operator = s.next();
//		double result;
//		if (operator.equals("+")) {
//			result = num1+num2;
//		}else if (operator.equals("-")) {
//			result = num1-num2;
//		}else if (operator.equals("*")) {
//			result = num1 *num2;
//		}else if (operator.equals("/")) {
//			result = num1/num2;
//		}else if (operator.equals("%")) {
//			result = num1%num2;
//		}else {
//			System.out.println("Invalid operator selected: "+operator);
//			return; //do not execute the remaining code. Stop here
//		}
//		System.out.println("Result: " + result);
		
		switch(operator) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1 *num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		case "%":
			System.out.println(num1%num2);
			break;
			default:
			System.out.println("Invalid operator selected: "+operator);
		}
	}
	

}
