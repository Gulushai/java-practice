package day08;
import java.util.Scanner;
public class homework1 {

	  public static void main(String[] args) {
	    //Enter your code here
	
	    String firstName, lastName, fullName, email, street, state, city, address, contacts;
	    int age, zipcode;
	    double height, weight;
	    boolean isMarried;
	    long workPhoneNumber, personelPhoneNumber;
	    
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Welcome to the patient portal!");
	    System.out.println("Please enter your personal information");
	    
	    System.out.println("Enter your firstName ");
	    firstName = scan.next();
	    
	    System.out.println("Enter your lastName ");
	    lastName = scan.next();
	    
	    System.out.println("Enter your email ");
	    email = scan.next();
	    
	    System.out.println("Enter your street ");
	    street = scan.next();
	    
	    System.out.println("Enter your city ");
	    city = scan.next();
	    
	    System.out.println("Enter your state ");
	    state = scan.next();
	    
	    System.out.println("Enter your zipcode ");
	    zipcode = scan.nextInt();
	    
	    System.out.println("Enter your workPhoneNumber ");
	    workPhoneNumber = scan.nextLong();
	    
	    System.out.println("Enter your personelPhoneNumber ");
	    personelPhoneNumber=scan.nextLong();
	    
	    System.out.println("Enter your age ");
	    age = scan.nextInt();
	    
	    System.out.println("Enter your height");
	    height = scan.nextDouble();
	  
	    System.out.println("Enter your weight ");
	    weight = scan.nextDouble();
	    
	    System.out.println("Are you married");
	    isMarried = scan.nextBoolean();
	    
	    contacts = workPhoneNumber +", " + personelPhoneNumber + ", " + email;
	    fullName = firstName + ", "+ lastName;
	    address = street +", " + city +", " + state +", " + zipcode;
	    
	    System.out.println("Patient personal information");
	    System.out.println("Full name: " + fullName);
	    System.out.println("Address: " + address);
	    System.out.println("Contacts: work phone number - " + contacts);
	    System.out.println("Age: " + age);
	    System.out.println("Height: " + height);
	    System.out.println("Weight: " + weight);
	    System.out.println("Married?: " + isMarried);
	  }
	
	}


