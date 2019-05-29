package day36List;
import java.util.ArrayList;
public class MyArrayList {

	public static void main(String[] args) {
		//declare arrayList called languages
		
		//String[] languages = new String[6];
		ArrayList<String> languages = new ArrayList<>(); 
		
		languages.add("Java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Azerbaijan");
		languages.add("Ukranian");
		
		System.out.println("Numbers of values: "+languages.size());
		languages.add("TUrkish");
		System.out.println("Number of values: "+languages.size());
		
		languages.remove(0);
		System.out.println("Number of values: "+languages.size());
		
		System.out.println(languages.toString());
		
	}

}
