package day33MethodsReturn;

import day31_Methods.Calculator;

public class CalcTest {

	public static void main(String[] args) {
		System.out.println(MethodReturn.add(3, 1));
		System.out.println(MethodReturn.multiply(5,6));
		System.out.println(MethodReturn.divide(100, 2));
		System.out.println(MethodReturn.minus(45, 13));
		
		int addResult = MethodReturn.add(21, 31);
		double mResult = MethodReturn.multiply(50, 40);
		double miResult = MethodReturn.minus(3000, 200);
		double dResult = MethodReturn.divide(654, 23);
		
		System.out.println("Add Result "+addResult);
		System.out.println("Multiply result "+ mResult);
		System.out.println("Minus result "+ miResult);
		System.out.println("Divide result "+dResult);
		
		double a = 10.0, b=5.0;
		double myResult = MethodReturn.minus(a, b);
		System.out.println("My result: "+myResult);
		
		double[] nums = {2.0, 4.0};
		double result2 = MethodReturn.multiply(nums[0], nums[1]);
		System.out.println("result 2: "+result2);
		
		if(MethodReturn.add(10, 16)==26) {
			System.out.println("Add unit test passed");
		}else {
			System.out.println("Add unit test failed");
		}
		String str = "java";
		if(str.length()==4) {
			System.out.println("It is 4 characters");
		}else {
			System.out.println("It is not 4 characters");
		}
	}

}
