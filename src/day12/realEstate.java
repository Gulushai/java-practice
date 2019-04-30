package day12;

import java.util.Scanner;

public class realEstate {

	public static void main(String[] args) {
		int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots = 0;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
    //WRITE YOUR CODE HERE
		System.out.println("Enter your property type:");
		houseType = scan.nextLine();
		
		if (houseType.equals("Condo")) {
			propertyPrice+=50000;
		}
		if (houseType.equals("Town House")) {
			propertyPrice+=75000;
		}
		if (houseType.equals("Single Family House")) {
			propertyPrice+=95000;
			System.out.println(propertyPrice);
		}
		System.out.println("How many bedrooms do you have?");
		numberOfBedrooms = scan.nextInt();
		if (numberOfBedrooms >=1 ) {
			numberOfBedrooms *=30000;
			propertyPrice +=numberOfBedrooms;
			System.out.println(propertyPrice);
		}
		
		System.out.println("Do you have a backyard?");
		backyard = scan.nextBoolean();
		if(backyard==(houseType.equals("Single Family House"))) {
			propertyPrice +=5000;	
			System.out.println(propertyPrice);
			
		}else if (backyard==(houseType.equals("Town House"))) {
			propertyPrice +=5000;
			System.out.println(propertyPrice);
		
		}else if(houseType.equals("Condo")){
			System.out.println("Backyard is not available for condo!");
		}
		
		System.out.println("Do you have garage?");
		garage = scan.nextBoolean();
		if(garage) {
			System.out.println("How many spots?");
			garageSpots = scan.nextInt();
			if(garageSpots>=1 && garageSpots<10) {
			garageSpots *=20000;
			propertyPrice +=garageSpots;
			System.out.println(propertyPrice);
			}else if(garageSpots>10){
				System.out.println("Pardon, it's not a public parking!");
		  }
		}
		System.out.println("How close is metro station?");
		metroAccessibility = scan.nextFloat();
		if(metroAccessibility<=1) {
			propertyPrice +=10000;
		}else if (metroAccessibility<=3) {
			propertyPrice +=5000;
		}
		System.out.println("How close is highway?");
		highwayAccessibility = scan.nextFloat();
		if(highwayAccessibility<=1) {
			propertyPrice +=15000;
		}else if(highwayAccessibility<=5) {
			propertyPrice +=8000;
		}else if(highwayAccessibility<=20) {
			propertyPrice +=4000;
		}
		System.out.println("What's the rating of nearest school?");
		schoolScore = scan.nextFloat();
		if(schoolScore>=8 && schoolScore<=10) {
			propertyPrice +=45000;
		}else if(schoolScore>=4 &&schoolScore<=8) {
			propertyPrice +=20000;
		}else {
			propertyPrice +=5000;
		}
		System.out.println("Does any of your family members smoking?");
		smoking =scan.nextBoolean();
		if(smoking) {
			propertyPrice -=5000;
		}
		System.out.println("Market report has been generated.");
		System.out.println("Your estimate market price is: "+ propertyPrice+"$");
	
}
}
