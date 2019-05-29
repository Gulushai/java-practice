package day45_EncapsulationPractice;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setName("Java Programing");
		
		List<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasyl");
		javaTeachers.add("Murodil");
		javaTeachers.add("Muhtar");
		javaTeachers.add("Marufjon");
		
		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());
		
		List<String> javaStudents = new ArrayList<>();
		javaStudents.add("Burak");
		javaStudents.add("Roman");
		javaStudents.add("Adilet");
		javaStudents.add("Sam");
		javaStudents.add("Ethem");
		
		course1.setStudents(javaStudents);
		System.out.println(course1.toString());
		
		course1.addTeacher("Maria");
		course1.addStudent("Kate");
		
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		if(course1.getStudents().contains("Kate")) {
			System.out.println("Kate is a student");
		}else {
			System.out.println("Kate is not a student");
		}
		course1.removeTeacher("Murodil");
		course1.removeStudent("Roman");
		
		if(!course1.getTeachers().contains("Murodil")) {
			System.out.println("Murodil is removed");
		}else {
			System.out.println("Murodil is still a teacher");
		}
		if(!course1.getStudents().contains("Roamn")) {
			System.out.println("Roman is removed");
		}else {
			System.out.println("Roman is still is a student");
		}
		System.out.println(course1.toString());

	}

}
