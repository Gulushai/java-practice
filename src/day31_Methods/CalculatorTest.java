package day31_Methods;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		Calculator.add(45, 9);
		Calculator.multiply(10, 4);
		Calculator.remainder(num1, num2);
		Calculator.divide(num1, num2);
	}

}
