package day50_Inheritence;

public class Company {

	public static void main(String[] args) {
		Employee emp = new Employee();
		FullTimeEmployee ftemp = new FullTimeEmployee();
		Contractor c =new Contractor();
		
		emp.calculatePay(40,40);
		ftemp.calculatePay(40, 40);
		c.calculatePay(40, 40);
		
	}

}
