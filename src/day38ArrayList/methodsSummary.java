package day38ArrayList;

import java.util.ArrayList;
import java.util.List;

public class methodsSummary {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("blue");
		list1.add("red");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		//add method with index: "yellow will be placed to index 0"
		list1.add(0, "yellow");
		//toString method
		System.out.println(list1.toString());
		//size method
		System.out.println("Number of elements: "+ list1.size());
		//get method
		System.out.println("3: "+list1.get(3));
		System.out.println("0: "+ list1.get(0));
		//remove method
		list1.remove(0);//removes yellow
		System.out.println(list1.toString());
		//remove using value or element. removes element first occurence
		list1.remove("blue");//removes blue
		System.out.println(list1.toString());
		//set(index, value) replace certain index with new value
		list1.set(0, "orange");
		System.out.println(list1.toString());
		//indexOf(value) returns index of value in the list
		System.out.println("grey: "+list1.indexOf("grey"));
		System.out.println("green: "+ list1.indexOf("green"));
		//isEmpty returns true is list is empty
		System.out.println("is list Empty? - "+list1.isEmpty());
		System.out.println("is list Empty? - "+(list1.size()== 0));
		//contains element - returns true if value is present
		System.out.println("white in list? - "+ list1.contains("white"));//true
		
		
		List<String> list2 = new ArrayList<>();
		//ADDALL values from one list into another
		list2.addAll(list1);
		System.out.println("list2: "+ list2.toString());
		//CONTAINSALL check if list has all values of another list
		System.out.println("containsAll: "+list1.containsAll(list2));
		//EQUALS(list) check if 2 lists are exactly equal
		System.out.println("equals: "+list1.equals(list1));
		
		list2.add("pink");
		//REMOVEALL(list) removes all matching values from your list
		list2.removeAll(list1);
		System.out.println("list2 after removeALL: "+ list2);
		System.out.println("List1: "+ list1);
		
		//AddAll(index, list) adds a new list values starting from given index
		list2.addAll(0, list1);
		System.out.println("list2 after list2.addAll(0, list1): "+ list2);
		
		list1.clear();
		list2.clear();
		System.out.println("boht empty? - "+ (list1.isEmpty()&&list2.isEmpty()));
 		
		
	}

}
