package day08;

import java.util.Scanner;

public class gradeScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner type = new Scanner(System.in);
		System.out.println("What is your grade?"); 
		char grade = type.next().toUpperCase().charAt(0);
		 
		if (grade =='A') {
			System.out.println("Excellent Job! Keep it up!");
		}else {
			System.out.println("Your grade " + grade + " is not good enough");
			System.out.println("How many points did you miss for 'A'");
			int points = type.nextInt();
			System.out.println("You could earn " +points + " more points if you studied harder");
		}
	}

}
