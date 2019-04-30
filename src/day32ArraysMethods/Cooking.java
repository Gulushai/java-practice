package day32ArraysMethods;

public class Cooking {

	public static void main(String[] args) {
		System.out.println("Chicken curry");
		add("onion, tomato, curry leaves, chicken");
		mix(5);
		fry(10);
		boil(1);
		cook("Omlet", "Eggs, Salt, Tomatoes, Green peppers, Onion");
	}
	public static void add(String ingredients) {
		System.out.println("Add ingredients: "+ ingredients);
		
	}
	public static void mix (int seconds) {
		System.out.println("Mix "+ seconds + " seconds");
	}
	public static void fry (int minutes) {
		System.out.println("Fry "+ minutes + " minutes");
	}
	public static void boil (int hours) {
		System.out.println("Boil "+ hours + " hours");
	}
	public static void cook (String dish, String ings) {
		System.out.println("-- "+ dish.toUpperCase() + " Recipe--");
		add(ings);
		System.out.println("Cook it until it is cooked");
		System.out.println("--" + dish.toUpperCase()+ " is Ready--");
		
	}
	

	
//	add something
//    -> mix some seconds
//    -> fry some minutes
//    -> boil some minutes
//    1) method name add
//       -> return: void
//       -> params: 1 String 
//       -> print "Add something"
//       add("oil"); "Add oil"
//       add("oil, onions");"Add oil, onions"
//    2) mix
//       -> param: 1 int seconds
//       "Mix for 10 seconds"

}
