package day53_Inheritance;

public class Cities {
	public static void main(String[] args) {
		City baku = new City(123, "Baku");
		System.out.println(baku.toString());
		
		City istanbul = new City(2343, "Istanbul");
		City anotherCity = new City(2343, "Istanbul");
		
		if(istanbul.equals(anotherCity)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("not equal");
		}
		
		System.out.println(istanbul);
		System.out.println(anotherCity);
		
		System.out.println(baku.hashCode());
		System.out.println(istanbul.hashCode());
		System.out.println(anotherCity.hashCode());
		
		Capital cap = new Capital(101, "Washington DC", 800_000L);
		System.out.println(cap.toString());
	}
}
