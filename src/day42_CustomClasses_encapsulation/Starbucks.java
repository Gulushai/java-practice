package day42_CustomClasses_encapsulation;

public class Starbucks {
	public static void main(String[] args) {
		//declared an array that can store 2 coffee objects
		Coffee[] coffeeArray = new Coffee[2];
		coffeeArray[0] = new Coffee();
		coffeeArray[0].setCoffeeInfo("Espresso", "tall", 2.55, 150);
		coffeeArray[0].getCoffeeInfo();
		
		Coffee latte = new Coffee();
		latte.setCoffeeInfo("Cafe Latte", "grande", 3.85, 250);
		
		coffeeArray[1]=latte;
		coffeeArray[1].getCoffeeInfo();
		latte.getCoffeeInfo();
		
	}
	
}
