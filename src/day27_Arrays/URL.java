package day27_Arrays;

import java.util.Arrays;

public class URL {

	public static void main(String[] args) {
		
		String url = "https://learn.cybertekschool.com/courses/144/assignments/744";
		//147 - Java programming
		//204 - Mentoring session
		//149 - SDLC
		//156 - QA Testing
		//
		String[] arr = url.split("/"); 
		System.out.println(Arrays.toString(arr));
		System.out.println("length:" + arr.length); // 7 arrays words between /
		System.out.println(arr[arr.length-1]);
			System.out.println(arr[6]);
			//parseInt - converts from int to String
		int courseID = Integer.parseInt(arr[arr.length-1]);
			
		switch(courseID) {
		case 147:
			System.out.println("Course name is Java Programming");
			break;
		case 204:
			System.out.println("Course name is Mentoring session");
			break;
		case 149:
			System.out.println("Course name is SDLC");
			break;
		case 156:
			System.out.println("Course name is QA Testing");
			break;	
		case 744:
			System.out.println("Course name Welcome kit");
			break;	
			default:
				System.out.println("Invalid number for the course");
				break;
		} 
		
	}

}
