package day28_Arrays;

import java.util.Arrays;

public class Loops2DArrays {

	public static void main(String[] args) {
		String[][] pizzas = {
				{"pineapple", "pepperoni"},
				{"anchovies", "mushrooms", "olives"},
				{"4 cheeses"},
				{"chicken","tomatoes", "jalapenos", "onions"},
				{"green peppers", "zuccini", "broccoli", "spinach", "shrimp"},
				};
		System.out.println(Arrays.toString(pizzas[0]));
		System.out.println();
		for (String[] p : pizzas) {
			System.out.print(p.length+"-");
			System.out.println(Arrays.toString(p));
		
			System.out.println();
		for( int i=0; i<pizzas.length; i++) {
			System.out.print(pizzas[i].length+ "-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		System.out.println();
		for(String topping : pizzas[0]) {
			System.out.print(topping + ", ");
		
		}
		}

	}

}
