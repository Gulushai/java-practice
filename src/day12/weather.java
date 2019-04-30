package day12;

import java.util.Scanner;

public class weather {

	private static String sunny;
	private static String hot; 
	private static String rainy;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String weather =s.next();
		switch (weather) {
		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go Swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Go kite");
			System.out.println("Code Java");
			break;
		case "rainy":
			System.out.println("Go shopping");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Change your tires");
			System.out.println("Code Java");
			break;
			default:
				System.out.println("Code Java in any other weather");
		}
	}

}
