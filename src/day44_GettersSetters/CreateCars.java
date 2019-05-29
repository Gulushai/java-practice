package day44_GettersSetters;

public class CreateCars {

	public static void main(String[] args) {
		Car delorean = new Car("GM","DeLorean","20000");
		System.out.println(delorean.getMake());
		System.out.println(delorean.getModel());
		System.out.println(delorean.getPrice());
		
		delorean.setPrice("19000");
		System.out.println(delorean.getPrice());
		
		Car corolla = new Car("Toyota", "Corolla", "20000");
		
		System.out.println(corolla.getMake());
		System.out.println(corolla.getModel());
		System.out.println(corolla.getPrice());
		
		corolla.setPrice("15000");
		System.out.println(corolla.getPrice());
		
		

	}

}
