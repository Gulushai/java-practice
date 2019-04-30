package day19WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class guessANumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random random = new Random();
		int secretNum = random.nextInt(101);
		int num;
		
		do {
			System.out.println("enter your number: ");
			num = scan.nextInt();
			if (num>secretNum) {
				System.out.println("Your number is too large");
			}	else if(num<secretNum) {
				System.out.println("your number is too small");
			}
		}while(num!=secretNum);
		System.out.println("Bingo, congratulations, you won");
		}
	}



	
