package day29_Arrays;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries = {{"USA",	"Washington DC"},
								{"Canada",	"Ottawa"}, 
								{"Mexico",	"Mexico city"},
								{"Brasil",	"Brasilia"},
								{"Peru",	"Lima"},
								{"Argentina",	"Buenos Aeros"},
								{"Bolivia",	"La Paz"},
								{"Macedonia",	"Scopia"},
								{"Kazakhstan",	"Astana"}};
		String [][] c = new String[9][2];
		c[0][0] = "USA";
		c[0][1] = "Washington DC";
		
		System.out.println(countries[1][0]+" | " + countries[1][1]);
		System.out.println(countries[8][0]+" | " + countries[8][1]);
		System.out.println(Arrays.deepToString(countries));
		
		for(int i =0; i<countries.length; i++) {
			System.out.print(countries[i][0]+"|");
		}
		System.out.println();
		for(String[] arr : countries) {
			System.out.print(arr[0]+"|");
		}
		System.out.println();
		String[] cities = new String[countries.length];
		System.out.println(Arrays.toString(cities));
		for (int i =0; i<countries.length; i++) {
			cities[i] = countries[i][1];
		}
		System.out.println(Arrays.toString(cities));
		
		for(String[] city : countries) {
		System.out.print(city[1] +"|" );
		}
		System.out.println();
		for(int i=0; i<countries.length; i++) {
			if(countries[i][0].contains("Bolivia")) {
				System.out.println(countries[i][1]);
					if(countries[i][1].equals("La Paz")){
						System.out.println("Bolivia test passed");
					}else {
						System.out.println("Bolivia test failed");
					}
					break; //exit the loop
				}
			}
		
			
		
	}

}
