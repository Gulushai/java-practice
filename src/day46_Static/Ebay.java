package day46_Static;

public class Ebay {

	public static void main(String[] args) {
		Customer cm1 = new Customer("Abdallah Aleies", "abdallah@gmail.com");
		Customer cm2 = new Customer("Adilet Kyrgyz", "adilet@yahoo.com");
		Customer cm3 = new Customer("Anastasiia Zasybna", "anastasia@outlook.com");
		
		System.out.println(cm3.count);
		
		Customer cm4 = new Customer("Burak Ucal", "bura@yahoo.com");
		System.out.println("Total customer: "+Customer.count);
		
		cm1.count = 10;
		System.out.println(cm3.count);
		System.out.println(Customer.count);

	}

}
