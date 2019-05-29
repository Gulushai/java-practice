package day38ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {

	public static void main(String[] args) {
		List<Integer> numsList = new ArrayList<>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(1000);
		numsList.add(3);
		
		System.out.println("Sorting ... Please wait... ");
		Collections.sort(numsList);
		
		System.out.println(numsList);
		
		List<String> str = new ArrayList<>();
		str.add("Fuad");
		str.add("Roman");
		str.add("Murad");
		str.add("Dina");
		str.add("Maria");
		str.add("Bojan");
		
		System.out.println(str);
		System.out.println("Sorting ... Please wait... ");
		Collections.sort(str);
		System.out.println(str);
		
		//MAX, MIN
		int maxNum = Collections.max(numsList);
		int minNum = Collections.min(numsList);
		System.out.println("maxNum: "+ maxNum);
		System.out.println("minNum: "+ minNum);
		
		String maxName = Collections.max(str);
		String minName = Collections.min(str);
		System.out.println("maxName: "+ maxName);
		System.out.println("minName: "+ minName);
		
		Collections.shuffle(str);
		System.out.println(str);

	}

}
