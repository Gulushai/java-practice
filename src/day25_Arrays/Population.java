package day25_Arrays;

public class Population {

	public static void main(String[] args) {
		
		String[] city = {"Mexico, Columbia, Rome, London, Paris"};
		int[] population = new int[5];
		
		population[0] = 5000;
		population[1] = 10000;
		population[2] = 1002;
		population[3] = 76544;
		population[4] = 786787;
		
		int[] population1 = {5000, 10000, 1002, 76544, 786787}; 
		System.out.println(population[0]);
		
		int idx =0;
		System.out.println("City 0 population: "+ population[idx]);
		
		idx++;
		System.out.println("City 1 population: "+ population[idx]);
		
		String str = "abcd";									//4
		System.out.println("City 1 population: "+ population[str.length()]);
		
		String[] cities = {"Miami", "London", "Tokyo", "Rome", "NewYork"};
		
		for (String array: cities){
			System.out.println("Population of " + cities[0]+ " is: "+ population[0]);
			System.out.println("Population of " + cities[1]+ " is: "+ population[1]);
			System.out.println("Population of " + cities[2]+ " is: "+ population[2]);
			System.out.println("Population of " + cities[3]+ " is: "+ population[3]);
			System.out.println("Population of " + cities[4]+ " is: "+ population[4]);
		}
		
	}

}
