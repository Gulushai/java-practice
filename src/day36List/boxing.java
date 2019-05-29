package day36List;

public class boxing {

	public static void main(String[] args) {
		//Autoboxing -> primitive > object
		Integer num1 = 1234;
		int n=3;
		Integer num2 = n;
		//Unboxing -> object > primitive
		Double d1 = new Double (34.2);
		double d2 = d1;
		
		long l1 = new Long(8000000); //unboxing 
		Long l2 = new Long(434235345L); // no boxing
		long l3 = l2; //unboxing
		Long l4 = l3; //autoboxing
		
		Integer num3 = Integer.valueOf(3423);
		//Double d3 = num3;

	}

}
