package day38ArrayList;
import java.util.*;
public class containsMethod {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		ArrayList<String> list2 = list1; //list1 and list2 point to the same object
		//copy all values from list1
 		ArrayList<String> months = new ArrayList<>(list1);
		System.out.println(months);
		
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		System.out.println(months);
		//[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug]
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		System.out.println(months.get(2).equals("Mar"));
		System.out.println(months.indexOf("Feb")==1);
		
		ArrayList<String> month2 = new ArrayList<>(list1);
		
		System.out.println("Month: "+months);
		System.out.println("Month2: "+month2);
		
		if(months.containsAll(month2)) {
			System.out.println("Months has all month2");
		}else {
			System.out.println("Some values are missing");
		}
		
		System.out.println(months.containsAll(month2));
	}

}
