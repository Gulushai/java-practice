package day50_Inheritence;

public class FullTimeEmployee extends Employee{
	@Override
	public void calculatePay(int hours, double rate) {
		double total = (hours*rate)*0.05 +(hours * rate);//should include 5% bonus
		System.out.println("Employee Total pay: "+ (total));
	}
}
