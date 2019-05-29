package day46_Static;

public class Vehicle {
	String type; //instance variable, every object has its own type
	static int numberOfVehicles; //shared, one central value
	
	public static void vehicleInfo() {
		//System.out.println(type);//will not compile type it non-static
		System.out.println("number Of vehicles: "+numberOfVehicles);
		int count = getNumberOfVehicles();
		String make = "Kia";
		make = make.toUpperCase();
	}
	
	public static int getNumberOfVehicles() {
		return numberOfVehicles;
		
	}
	
	public String toString() {
		return "Car type: "+type+" | count: "+numberOfVehicles;
	}
	
}
