package day41_customClasses;

public class BMW {

	String make="BMW";
	String model;
	double price;
	
	
	public void showPrice() {
		switch(model) {
		case "330i":
			price = 40.250;
			break;
		case "740i":
			price= 86.450;
			break;
		case "m3":
			price = 66.500;
			break;
			default:
				System.out.println("Invalid "+ model);
				price = 0.0;
		}
		System.out.println("Price: "+price);
	
		
	}
	
	
}
