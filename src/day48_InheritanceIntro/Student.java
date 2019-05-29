package day48_InheritanceIntro;

public class Student extends Person{
	int studentID;
	String clazz;
	
	public void code (String lang) {
		System.out.println(name+ " is coding");
	}
	public void attendClass() {
		System.out.println(name + " Java");
	}
}
