package day38ArrayList;

import java.util.ArrayList;
import java.util.List;

public class equalsMethod {

	public static void main(String[] args) {
		List<String> friends1 = new ArrayList<>();
		List<String> friends2 = new ArrayList<>();
		
		friends1.add("Sam");
		friends1.add("Anna");
		friends1.add("Nunu");
		friends1.add("Mom");
		
		friends2.add("Sam");
		friends2.add("Anna");
		friends2.add("Nunu");
		friends2.add("Mom");
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		if(friends1.equals(friends2)) {
			System.out.println("Same friends");
		}else {
			System.out.println("Different friends");
		}
	}

}
