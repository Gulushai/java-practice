package day32ArraysMethods;

public class MethodsWithReturn {

	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i=giveMe10$();
		System.out.println("i: " + i);
		
		String myName= giveMeYourName();
		System.out.println("May name is: "+myName);
		System.out.println(giveMeYourName());
	}
	// this method returns int value
	public static int giveMe10$() {
		System.out.println("returning 10 from the method");
		return 10;
		
	}
	
	public static String giveMeYourName() {
		
		return "Gul";
	}

}
