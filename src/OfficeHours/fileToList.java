package OfficeHours;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileToList {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Product.txt");
		Scanner scan = new Scanner(file);
		//System.out.println(scan.nextLine());
		
		ArrayList<String> data = new ArrayList<>();
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println(line);
			data.add(line);
		}
		System.out.println("Number of products: "+ data.size());
		System.out.println(data.toString());
	
//		while(scan.hasNextLine()) {
//			//it read a line and switches to the next line
//			System.out.println(scan.nextLine());
//		}
	}

}
