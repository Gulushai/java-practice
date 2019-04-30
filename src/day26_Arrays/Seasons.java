package day26_Arrays;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		// please write a program that will print season name based on the int value
		// value will be provided through the scanner
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter month number");
		int seasonName = scan.nextInt();
		String message = "";
		
//		if(seasonName >= 1 && seasonName <=2 || seasonName ==12) {
//			System.out.println("Winter");
//		} else if(seasonName >= 3 && seasonName <=5) {
//			System.out.println("Spring");
//		} else if(seasonName >= 6 && seasonName <= 8) {
//			System.out.println("Summer");
//		} else if(seasonName >= 9 && seasonName <= 11) {
//			System.out.println("Autumn");
//		} else {
//			System.out.println("Invalid value!");
//		}
		
		switch(seasonName) {
		case 1:case 2:case 12:
			message = "Winter";
			break;
		case 3:case 4:case 5: 
			message = "Spring";
			break;
		case 6:case 7:case 8:
			message = "Summer";
			break;
		case 9:case 10:case 11:
			message = "Autumn";
			break;
			default:
				System.out.println("Invalid number");
		}
		System.out.println(message);
	}

}
