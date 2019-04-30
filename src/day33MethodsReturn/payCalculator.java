package day33MethodsReturn;

public class payCalculator {

	public static void main(String[] args) {
		double Pay =getHourlyPay(34,2);
		System.out.println("Total pay for 40 hours: "+ Pay);
		System.out.println(getHourlyPay(0,10));
		double noPay = getHourlyPay(0,10);
		System.out.println("Total pay for 40 hours: "+ noPay);
		
	}
	public static double getHourlyPay(int hours, double rate) {
		
		if(hours<=0) {
			System.out.println("Invalid hours");
			return 0;//if hour is 0 it will exit the method
		}
		if(rate<=0) {
			System.out.println("Invalid rate");
			return 0;
		}
		double totalPay= hours*rate;
		return totalPay;
	} 

}
