package day50_Inheritence;

public class Employee {
	int hours;
	double rate;
	public void calculatePay(int hours, double rate) {
		System.out.println("Employee Total pay: "+ (hours*rate));
	}
	
	
	
}
