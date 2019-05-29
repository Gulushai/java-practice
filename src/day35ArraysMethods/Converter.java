package day35ArraysMethods;

public class Converter {

	public static void main(String[] args) {
		 
		System.out.println(milesToKMS(10));
		System.out.println(milesToKMS(26));
		double km = milesToKMS(75);
		System.out.println(km);
		System.out.println(multiply(8, 28));
		System.out.println(milesToKMS(5));
		System.out.println(gallonsToLiters(2));
		System.out.println(gallonsToLiters(15));
		
	}
	public static double milesToKMS(double miles) {
		//double kmValue = miles*1.609;
		
		double kmValue = multiply(miles, 1.609);
		return kmValue;
	}
	public static double multiply(double num1, double num2) {
		return num1*num2;
	}
	
	public static double gallonsToLiters(double gallons) {
		double literValue = multiply(gallons,3.785);
		return literValue;
	}
}
