package day39_ArrayList;

import java.util.*;

public class Cities {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        cities.add("Lima");
        
        for(String c : cities) {
        System.out.print(" | "+c.toString() );
        }
        System.out.println();
        
        for(int i =0; i<cities.size(); i++) {
        	System.out.print(cities.get(i) + " | ");
        }
        System.out.println();
        
        //Print all cities to Upper Case
        System.out.print(cities.toString().toUpperCase());
        
        //Make each city all Upper Case
        String  paris = cities.get(0).toUpperCase();
        System.out.println(paris);
        cities.set(0, paris);
        System.out.println(cities.get(0));
        
        cities.set(1, cities.get(1).toUpperCase());
        
        for(int j=0; j<cities.size(); j++) {
        	String city = cities.get(j).toUpperCase();
        	cities.set(j, city);
        }
        
        System.out.println(cities.toString());
        
        //find the shortest and longest city
        
//        String longest = "";
//        String shortest ="";
//        for(String c : cities) {
//        	if(c.length()<=4) { //
//        		shortest = c;	//
//        		System.out.println(shortest);
//        	}else if(c.length()>4) {
//        		longest = c;
//        		System.out.println(longest);
//        	}
//        	System.out.println(shortest+ "<>"+longest);
//        }
        
        String longest ="";
        for(String city : cities) {
        	if(city.length()>longest.length()) {
        		longest = city;
        	}
        }
        String shortest = cities.get(0);
        for(String city : cities) {
        	if(city.length() < shortest.length());
        	shortest = city;
        }
        System.out.println("Longest city "+ longest);
        System.out.println("Shortest city "+ shortest);
        
        ArrayList <String> citiesMoreThan6 = new ArrayList<>();
        //arrays all cities that have more than 6 chars to this arrayList
        for(String ct : cities) {
        	if(ct.length()>6) {
        		citiesMoreThan6.add(ct);
        	}
        }
        System.out.println(citiesMoreThan6);
	}

}
