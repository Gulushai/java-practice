package OfficeHours;

public class Student {
	public String name;
	protected int studentID;
	
	public Student() {
		System.out.println("no arg from Student");
	}
	public Student(String name, int studentID) {
		System.out.println("2 args constructor from Student");
	}
	public void study() {
		System.out.println("Studying");
	}
	public String printDetail() {
		return name+studentID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
}
