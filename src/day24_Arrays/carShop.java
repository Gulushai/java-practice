package day24_Arrays;

import java.util.Arrays;

public class carShop {

	public static void main(String[] args) {
		//BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		//1. Step: Create an array of strings, and store these cars inside that array.
		
		String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		
		//2. Step: Print car names that starts with M
//		int i = 0;
//		while(i<cars.length) {
//			System.out.println(cars[i]);
//			i++;
//		}
		System.out.println();
		for (String c: cars) {
			if(!c.startsWith("M")) {
				continue;
			}
			System.out.println(c);
		}
		
		//3. Step: Print all cars that have letter "r" somewhere in the name.
		//Make your search case insensitive
		
		System.out.println();
		for(String make: cars) {
			if(!make.toLowerCase().contains("r")) {
				continue;
			}
			System.out.println(make);
		}
		//4. Step: Print car names that ends with a
		
		System.out.println();
		for(String end: cars) {
			if(!end.toLowerCase().endsWith("a")) {
				continue;
			}
			System.out.println(end);

		}
		System.out.println();
		for(String end: cars) {
			if(end.toLowerCase().endsWith("a")) {
				System.out.println(end);
			}
		}
		
		//5. Step Print all cars that have at least 6 letters in the name
		
		System.out.println();
		for(String c: cars) {
			if(c.length()>5) {
				System.out.println(c);
			}
		}
		System.out.println();
		for( int i=0; i<cars.length; i++) {
			String car = cars[i];
			if(car.length()>=6) {
				System.out.println(cars[i]);
			}
		}
		//6. Step Swap first and last value in the array
		// first value: cars[i], last value: cars[cars.length-1]
		System.out.println();
		String temp = cars[0];
		cars[0] = cars[cars.length-1];
		cars[cars.length-1] = temp;
		//Arrays before sorting and After sorting in alphabet order
				System.out.println(Arrays.toString(cars));
				Arrays.sort(cars);
				System.out.println(Arrays.toString(cars));
		
		System.out.println("Position: "+Arrays.binarySearch(cars, "Ford"));
		System.out.println();
		int num = Arrays.binarySearch(cars, "Ford");
		System.out.println("Position: "+Arrays.binarySearch(cars, num+1, num+1, cars));
		}
	

}
