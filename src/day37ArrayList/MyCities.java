package day37ArrayList;

import java.util.ArrayList;

public class MyCities {

	public static void main(String[] args) {
		ArrayList<String> cities= new ArrayList <>();
		cities.add("Barnaul");
		cities.add("Istanbul");
		cities.add("Bishkek");
		cities.add("Baku");
		cities.add("Dubai");
		
		for(String city : cities) {
			System.out.print(city+ " ");
		}
		System.out.println();
		
		for(int i=0; i<cities.size(); i++) {
			System.out.print(cities.get(i)+" ");
		}
		System.out.println();
		System.out.println("Removing Baku. ");
		cities.remove(3);
		System.out.println(cities);
		
		cities.remove("NewYork");
		System.out.println(cities);
		
		System.out.println("Is list empty? "+cities.isEmpty());
		
		cities.add(0, "Osh");
		System.out.println(cities.toString());
		
		cities.add(3, "Talas");
		System.out.println(cities.toString());
		
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		
		int idx = cities.indexOf("Barnaul");
		System.out.println("Index of Barnaul: "+ idx);
		
		cities.set(idx, "Zagreb");
		System.out.println(cities);
		
		cities.clear();
		System.out.println("empty: "+cities.isEmpty());
	}

}
