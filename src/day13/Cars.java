package day13;

import java.util.Scanner;

public class Cars {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("WHich type of car are you interested in? : ");
		System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean\n");
		int carType=s.nextInt();
		double averagePrice;
		String carOptions;
		String carOrigin;
		switch (carType) {
		case 1:
			averagePrice = 33000;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigin = "American";
			System.out.println("You selected American car and your options are Ford, Dodge, Tesla, Chevrolet, Lincoln");
			System.out.println("Average Price: "+averagePrice);
			break;
		case 2: 
			averagePrice = 32000;
			carOptions = "Mitsubishi, Honda, Subaru, Mazda";
			carOrigin = "Japanese";
			System.out.println("You selected Japanese car and your options are Mitsubishi, Honda, Subaru, Toyota, Mazda");
			System.out.println("Average Price is: "+averagePrice);
			break;
		case 3:
			averagePrice = 55000;
			carOptions = "BMW, VW, Mercedes-Benz, Porshe";
			carOrigin = "German";
			System.out.println("You selected German car and your options are BMW, VW, Mercedes-Benz, Porshe");
			System.out.println("Average Price is: "+averagePrice);
			break;
		case 4:
			averagePrice = 85000;
			carOptions = "Alfa Romeo, Moseratti, Fiat, Ferrari, Lamborghini";
			carOrigin = "Italian";
			System.out.println("You selected Italian car and your options are Alfa Romeo, Moseratti, Fiat, Ferrari, Lamborghini");
			System.out.println("Average Price is: "+averagePrice);
			break;
		case 5:
			averagePrice = 25000;
			carOptions = "Kia, Hyundai, Daewoo";
			carOrigin = "Korean";
//			System.out.println("You selected Korean car and your options are Kia, Hyundai, Daewoo");
//			System.out.println("Average Price is: "+averagePrice);
			break;
			default:
				System.out.println("Car type not available");
				return;
		}
		System.out.println("You selected "+carOrigin+" car and your options are "+ carOptions);
		System.out.println("Average Price is: "+averagePrice);

	}

}
