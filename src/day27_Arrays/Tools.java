package day27_Arrays;

public class Tools {

	public static void main(String[] args) {
		// Java - programming Language
		// Selenuim - Test Automation
		// TestNG - Unit testing
		// JUnit - Unit testing
		// Cucumber - BDD Style testing
		// Git - Version COntrol
		// Maven - Building and Execution for project
		
		String[] tools = {"Java", "Selenuim", "TestNG", "JUnit", "Cucumber", "Git", "Maven"};
		for(String arr : tools) {
			System.out.print(arr+ ", ");
			switch(arr.toLowerCase()) {
			case "java":
				System.out.println("Java - programming Language");
				break;
			case "selenium":
				System.out.println("Selenuim - Test Automation");
				break;
			case "testng":
				System.out.println("TestNG - Unit testing");
				break;
			case "junit":
				System.out.println("JUnit - Unit testing");
				break;
			case "cucumber":
				System.out.println("Cucumber - BDD Style testing");
				break;
			case "git":
				System.out.println("Git - Version COntrol");
				break;
			case "maven":
				System.out.println("Maven - Building and Execution for project");
				break;
				default:
					System.out.println("Invalid tool");
					break;
			}
		}

	}

}
