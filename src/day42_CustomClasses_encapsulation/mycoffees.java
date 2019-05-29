package day42_CustomClasses_encapsulation;

public class mycoffees {

	public static void main(String[] args) {
		Coffee coffee1 = new Coffee();
		coffee1.name ="Ice Caramel Machiato";
		coffee1.size = "TALL";
		coffee1.price = 3.50;
		coffee1.calories= 210;
		coffee1.getCoffeeInfo();
		
		Coffee coffee2 = new Coffee();
		coffee2.setName("White Chocolate Mocha");
		coffee2.size = "GRANDE";
		coffee2.price = 4.75;
		coffee2.calories = 260;
		coffee2.getCoffeeInfo();
		
		Coffee coffee3 = new Coffee();
		coffee3.setName("Iced Latte");
		coffee3.setSize("Venti");
		coffee3.setPrice(3.75);
		coffee3.calories = 600;
		coffee3.getCoffeeInfo();
	}

}
