package OfficeHours;

import OCAprep.OnlineStudent;

public class Classroom extends Student{

	public static void main(String[] args) {
		LocalStudent ls1 = new LocalStudent();
		LocalStudent ls2 = new LocalStudent();
		
		OnlineStudent os1 = new OnlineStudent();
		OnlineStudent os2 = new OnlineStudent();
		OnlineStudent os3 = new OnlineStudent();
		
		System.out.println(os1);
		System.out.println(ls1);
		System.out.println(os2);
		System.out.println(os3);
		System.out.println(ls2);

	}

}
