package day33MethodsReturn;

public class MethodReturn {

	public static void main(String[] args) {
		addVoid(2,5);
		int sum =add(5,8);
		double result = add(4,8);
		System.out.println("Result "+ result);
		System.out.println(add(6,4));
		result = multiply(5,-1);
		System.out.println("Multiply "+ result);
		result = minus(30, 5);
		System.out.println("Minus "+ result);
		result = divide(47, -1);
		System.out.println("Divide "+ result);
			
	}
	public static void addVoid(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Sum "+sum);
	}
	public static int add(int num1, int num2) {
		return num1+num2;
		
	}
	public static double multiply(double num1, double num2) {
		return num1*num2;
	}
	public static double minus(double num1, double num2) {
		return num1-num2;
	}
	public static int divide(int num1, int num2) {
		if(num2==0) {
			System.out.println("Error: Cannot divide by 0");
			return 0;
			//System.exit(0); Stops the whole code
		}else {
		return num1/num2;
	}
	}
}
