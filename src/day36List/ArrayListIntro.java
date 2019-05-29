package day36List;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// Create an Array List
		
		String[] str = new String[5];
		ArrayList<String> names = new ArrayList<>();
		
		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		
		//assign values into arrayList
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		
		nums.add(12);
		nums.add(234324);
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		System.out.println("Names count: "+ names.size());
		System.out.println("Nums count: "+ nums.size());

	}

}
