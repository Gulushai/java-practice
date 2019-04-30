package homeworks;

import java.util.Scanner;

public class CarInsuranceQuote {

	public static void main(String[] args) {
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = null;
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
    //WRITE YOUR CODE HERE
    System.out.println("Enter your name");
   name =scan.nextLine();
   
    
    
    
    System.out.println("Do you have a US drivers license?");
    String driversLicense= scan.next();
    
    if(driversLicense.equalsIgnoreCase("no")){
      System.out.println("Invalid data!");
      System.exit(0);
    }
    System.out.println("Provide ZipCode");
    int zipcode=scan.nextInt();
    if(zipcode==20910||zipcode==20740) {
    	premium = premium+60;
    	
    }else if(zipcode==22102||zipcode==22103) {
    	premium +=30;
    	
    }else {
    	premium +=50;
    	
    }
   
    System.out.println("Is this vehicle Owned, Financed, or Leased?");
    vehicleOwnership =scan.next();
    if(vehicleOwnership.equalsIgnoreCase("owned")) {
    	premium +=10;
    	
    }else {
    	premium +=20;
    	
    }

    System.out.println("How is this vehicle primarily used?");
    vehicleUsage = scan.next();
    if(vehicleUsage.equalsIgnoreCase("business")) {
    	premium +=50;
    	
    }else if(vehicleUsage.equalsIgnoreCase("pleasure")) {
    	premium +=10;
    	
    }else if(vehicleUsage.equalsIgnoreCase("Commute")) {
    	premium +=20;
    	System.out.println("Days Driven To Work And/Or School");
    	daysDrivenToWorkOrSchool=scan.nextInt();
    	premium += daysDrivenToWorkOrSchool*5;
    	
    	System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool =scan.nextInt();
        premium += milesToWorkOrSchool*1;
        
    }
    
    System.out.println("How old are you?");
    int age = scan.nextInt();
    if(age <16) {
    	System.out.println("Invalid data!");
    	System.exit(0);
    }else if(age>=16 && age<18) {
    	premium *=20;
    	
    }else if(age>=18 && age<=21) {
    	premium *=6;
    	
    }else if(age >21 && age<25) { 
    	premium *=2;
    	
    }
    
    System.out.println("How many years you've been driving?");
    int drivingExperience = scan.nextInt();
    if(drivingExperience>0 && (age - drivingExperience >= 16)) {
    	premium = premium - 5*drivingExperience;
    	
    }else {
    	System.out.println("Invalid data!");
    	System.exit(0);
    }
 
    System.out.println("Have you had an accidents in the last 5 years?");
    String accident=scan.next();
    if(accident.equalsIgnoreCase("yes")) {
    	System.out.println("How many?");
    	accidentsAmount = scan.nextInt();
        premium += premium * (accidentsAmount*.2); 
        
    }
    
    System.out.println("Have you had continuous insurance for the past 12 months?");
    continuousInsurance = scan.next();
    if(continuousInsurance.equalsIgnoreCase("No")) {
    	premium *=2;
    	
    }
    scan.nextLine();
    System.out.println("What is the highest level of education you have completed?");
    education = scan.nextLine();
    if(education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters")) {
    	premium -= premium*0.05;
    	
    } else if(education.equalsIgnoreCase("Doctors")) {
    	premium -= premium*0.10;
    	
    } else if(education.equalsIgnoreCase("Less than High School")) {
    	premium += premium* 0.05;
    	
    }
    
    System.out.println(name+" , here's your quote!");
    System.out.println("Start Your Policy Today For: $"+ premium);
    referenceNumber = name.substring(0,2).toUpperCase() + age + (name.substring(name.length()-2).toUpperCase()+zipcode+education.toUpperCase());
    System.out.println("Reference number: "+referenceNumber);

	}

}
