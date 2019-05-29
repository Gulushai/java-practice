package day46_Static;

public class Restaurant {

	public static void main(String[] args) {
		Dinner Mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner Dad = new Dinner();
		
		System.out.println("Total Slices: "+Dinner.pizzaSlices);
		
		Dad.takeASlice();
		kid.takeASlice();
		Mom.takeASlice();
		System.out.println("Total Slices: "+Dinner.pizzaSlices);
		System.out.println("Total Slices: "+Dad.pizzaSlices);
		
		kid.takeASlice(3);
		Dad.takeASlice(2);
		//Mom.takeASlice();
		System.out.println("Total Slices: "+Mom.pizzaSlices);
		System.out.println("Total Slices: "+Dinner.pizzaSlices);
		
	}

}
