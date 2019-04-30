package day07;

public class enoughPizza {
	public static void main(String[] args) {
		
		int pizzaCount = 30;
		int studentCount = 145;
		boolean isEnoughPizza = pizzaCount * 8 >=studentCount * 2;
		System.out.println("Is enough pizza: " + isEnoughPizza);
		
	}

}
