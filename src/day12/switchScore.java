package day12;

import java.util.Scanner;

public class switchScore {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Day:");
		int day = s.nextInt();
//		switch(score) {
//		case 1 :
//			System.out.println("Score is 1");
//			break;
//		case 2:
//			System.out.println("Score is 2");
//			break;
//		case 3:
//			System.out.println("Score is 3");
//			break;
//			default:
//				System.out.println("Invalid score");
//		}
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("not a such day");
		}
	}

}
