package OfficeHours;

public class Company {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.firstName = "Pavel";
		employee1.lastName = "Babayan";
		employee1.printInfo();
		
		Employee employee2 = new Employee();
		employee2.firstName = "Murad";
		employee2.printInfo();
		
		employee1.generateEmail();
		employee1.printEmail();
		employee1.setEmail("323214");
		employee1.setJobTitle("Carwasher");
		employee1.printInfo();

		

	}

}


//created array of employee
//Employee[] it_department = new Employee[2];
//Employee[] it_department = {employee1, employee2};
//type[] name = new type[size];
