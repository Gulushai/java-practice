package day40ArrayList;

public class Employee {

	public String name;//can be used anywhere in the project
	public String jobTitle;
	double salary;//can be used in the same package
	
	public void work() {
		
		System.out.println("Working employees name: "+name);
	}
	public void goToBreak() {
		System.out.println("Eployee goes to the break "+ jobTitle);
	}
	public void attendMeeting() {
		System.out.println("Employee attend meeting "+ name);
	}
	public void introduce() {
		System.out.println("Name ["+name+"], Job Title ["+jobTitle + "], Salary ["+salary+"]");
	}
}
