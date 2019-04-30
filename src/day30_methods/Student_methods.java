package day30_methods;

public class Student_methods {

	public static void main(String[] args) {
		study("Java");
		study("Selenium");
		sleep(8);
	}
	public static void study(String topic) {
		System.out.println("Student is studying " + topic);
	
	}
	
	public static void sleep(int hours) {
		System.out.println("Student has been sleeping for "+hours+ " hours");
	}
}
