package OfficeHours;

public class Employee {

	//Instance variables
	String firstName;
	String lastName;
	int employee_id;
	int age;
	float hourlyRate;
	char gender;
	boolean isInsured;
	String email;
	String title;
	String[] titles = {"Developer","Scrum master","SDET","PO","Functional tester","BA","HR"};
	
	//Instance method
	public void printInfo() {
		System.out.println("First name: "+firstName+" , Last name: "+lastName+" , Employee id: "+employee_id+" , Age "+age+" , Hourly Rate: "+hourlyRate+" , Gender "+gender+" , Insured? "+isInsured+" , Title: "+title+" , email: "+email);
	}
	
	//let's create a method that will generate an email for employee
	//use firstName_lastName@gmail.com as a template
	//your method suppose to accept object of employee as a parameter
	//and this method will have String as return type
	public String generateEmail() {
		String newEmail = firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@gmail.com";
		email = newEmail;
		return newEmail;
	}
	public void setEmail(String e ) {
		//lets check if email is valid before changing it
		if(e.contains("@")) {
			email = e;
		}else {
			System.out.println("Invalid email!");
		}
	}
	public void printEmail() {
		System.out.println("Email of "+firstName+" "+lastName+ " : "+email);
	}
	//this method will validate title before setting it
	public void setJobTitle(String str) {
		//by default it is false
		boolean isValid = false;
		for(String t : titles) {
			if(t.equals(str)) {
				//if we veryfies that title is valid
				//then we will set this title 
				title = str;
				//and isValid become a true
				isValid = true;
			}
		}
		if(isValid==true) {
			System.out.println("Title was set successfuly.");
		}else {
			System.out.println("Invalid title!");
		}
	}
}
