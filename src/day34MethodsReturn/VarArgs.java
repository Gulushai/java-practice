package day34MethodsReturn;

import java.util.Arrays;

public class VarArgs {

	public static void main(String... args) {
		printWords("red", "blue");//3 values
		printWords("grey");//one value
		printWords();
		String[] myPets = {"cat", "dog", "parrot", "goat"};
		printWords(myPets);
		
		System.out.println(sum(4,3,5,6,7));
		int budget = 200;
		if(sum(10,26,5,110,35)<=budget){
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		
		int total = sum(234, 355, 34,35,4532, 4332);
		System.out.println("total: "+total);
		
		cook("Plov", "carrot", "rice", "garlic", "chicken broth", "meat");
		cook("Burrito", "rice", "bean", "avocado", "Sour cream", "hot sauce");
		shoppingList(1000, "Swatch watch", "shoes", "shirt", "skirt");
		
	}
	public static void printWords(String... words) {
		//handle it like an Array
		for (String w:words) {
		System.out.println(w);
		}
	}
	public static int sum(int... nums) {
		int sum = 0;
		for(int num : nums) {
			sum +=num;
			
		}
		return sum;
	}
	public static void cook (String name, String... ingredients) {
		System.out.print("Food: "+ name);
		System.out.println(Arrays.toString(ingredients));
	}
	
	public static void shoppingList(int totalPrice, String... items) {
		System.out.print("Total cost: "+ totalPrice);
		System.out.println(Arrays.toString(items));
	}
	

}
