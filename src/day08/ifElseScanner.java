package day08;

import java.util.Scanner;

public class ifElseScanner {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		int passingPersentage = 65;
//		int yourScorePercentage;
//		yourScorePercentage = scan.nextInt();
//		if(yourScorePercentage>passingPersentage) {
//			System.out.println("You passed");
//		}else {
//			System.out.println("failed");
//		}
		
		Scanner scan = new Scanner(System.in);
		int votingAge = 18;
		int yourAge;
		
		System.out.println("How old are you?");
		
		yourAge = scan.nextInt();
		int years = yourAge -votingAge;
		if(yourAge>votingAge) {
			System.out.println("you have been eligible for " + years + " years");
		}else{
			System.out.println("you still have 3 more years to go");
		}
		
	}

}
