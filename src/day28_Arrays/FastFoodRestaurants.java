package day28_Arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {
		//read all data and assign to String array 
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: "+ data.length);
		
		//print first row
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length-1]);
		//System.out.println(Arrays.toString(data));
		
		//print each restaurant information in separate line
//		int counter = 0;
//		for (String restaurant : data) {
//			System.out.println("#"+ counter + "=>" +restaurant);
//			counter++;
//		}
		
		//Print all restaurant information  in state of VA
		//Also counted and print the number
		System.out.println();
		int count=0;
		for (int i = 0; i<data.length; i++) {
			if(data[i].contains(",VA,")) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println();
		for(String row : data) {
			if(row.contains(",VA,")) {
				System.out.println(row);
				count++;
			}
		}
		System.out.println("Total restaurants: "+ count);
		
		//Find all restaurant information in state of VA
		//print restaurants name along with cityname
		//Subway - Herndon
		
		int count1=0;
		for(String fastFood : data ) {
			if(fastFood.contains(",MD,")&&fastFood.contains("Columbia")) {
				String[] res = fastFood.split(",");
				System.out.println(res[2] + " - "+res[1]);
				count1++;
				
			}
		}
		System.out.println(count1);
		
		
		
		
		
		
	}

}
