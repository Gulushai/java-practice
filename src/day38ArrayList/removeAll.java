package day38ArrayList;

import java.util.ArrayList;
import java.util.List;

public class removeAll {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(12);
		list1.add(43);
		list1.add(7);
		list1.add(9);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(12);
		list2.add(3);
		list2.add(20);
		list2.add(12);
		list2.add(23);
		list2.add(7);
		list2.add(12);
		
		System.out.println(list1);
		System.out.println(list2);
		//remove all matching values from list1
		list2.removeAll(list1);
		System.out.println(list2);

	}

}
