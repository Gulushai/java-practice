package day53_Inheritance;

public class TestHiding {
	public static void main(String[] args) {
		City city = new City(300, "London");
		Capital cap = new Capital(444, "Paris", 34234L);
		
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		
		cap.displayCount();
		
		// call static methods
		
		city.buildARoad();
		cap.buildARoad();
		
		City.buildARoad();
		Capital.buildARoad();
		
		City city2 = new City(3334, "McLean");
		Capital cap2 = new Capital(5555, "Columbia", 9000000L);
		
		city2.letsBuildARoad();
		cap2.letsBuildARoad();
		
	}
}
