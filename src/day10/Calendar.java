package day10;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month number:");
		int month = scan.nextInt();
		String Month = null;
		switch(month) {
		case 1: Month = "January";
			break;
		case 2: Month = "February";
			break;
		case 3: Month = "March";
			break;
		case 4: Month = "April";
			break;
		case 5: Month = "May";
			break;
		case 6: Month = "June";
		break;
		case 7: Month = "July";
		break;
		case 8: Month = "August";
		break;
		case 9: Month = "September";
		break;
		case 10: Month = "October";
		break;
		case 11: Month = "November";
		break;
		case 12: Month = "December";
		break;
		default: Month = "Invalid number!";
			break;		

	}
		System.out.println(Month);		
	}
}
