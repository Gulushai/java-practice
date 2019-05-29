package day40ArrayList;

public class testEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.name = "Kate";
		emp1.jobTitle = "developer";
		emp1.salary = 115000.0;
		
		emp1.work();
		emp1.attendMeeting();
		emp1.introduce();
		
	
		emp1.jobTitle = "Team Lead";
		emp1.salary = 120000;
		emp1.introduce();
	}
}
