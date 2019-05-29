package day50_Inheritence;

public class Contractor extends Employee{
	@Override
	public void calculatePay(int hours, double rate) {
		//gets $200 extra for each pay
		System.out.println("Employee Total pay: "+ ((hours*rate)+200));
	}
}
