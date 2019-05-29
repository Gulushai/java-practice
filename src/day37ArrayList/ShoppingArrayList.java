package day37ArrayList;

import java.util.ArrayList;

public class ShoppingArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> ShoppingList = new ArrayList<>();
		ShoppingList.add("paper towel");
		ShoppingList.add("dish soap");
		ShoppingList.add("trash bag");
		ShoppingList.add("clorox");
		ShoppingList.add("gloves");
		ShoppingList.add("shovel");
		
		int count =ShoppingList.size();
		System.out.println("Items: "+count);
		
		System.out.println(ShoppingList.toString());
		
		//Print first and last item
		
		System.out.println(ShoppingList.get(0)+ " | "+ ShoppingList.get(count-1));
		ShoppingList.remove(0);
		ShoppingList.remove("shovel");
		System.out.println(ShoppingList.toString());
		
		
		for(String item : ShoppingList) {
			System.out.println(item);
		}
		//remove all items at once
		ShoppingList.clear();
		System.out.println(ShoppingList);
	}
	

}
