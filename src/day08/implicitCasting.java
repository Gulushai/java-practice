package day08;

public class implicitCasting {

	public static void main(String[] args) {
		
		//automatic casting from smaller to larger type
		
		short shortValue = 3455;
		int intValue = shortValue;
		//int intValue = (int)shortValue optional
		
		System.out.println("int value " + intValue);
		
		double price = 345;
		System.out.println("price " + price);
		
		int price1 = 35423;
		double dprice = price1;
		System.out.println("dPrice after casting " + price1);
	}

}
