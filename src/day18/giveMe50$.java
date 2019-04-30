package day18;

import java.util.Scanner;

public class giveMe50$ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int dollars = 0;
//		while (dollars!=5) {
//			System.out.println("give me 5 $");
//			dollars = scan.nextInt();
//			
//		}System.out.println("thank you for 5$");

//		int pincode = 0;
//		while(pincode !=4433) {
//			System.out.println(pincode + " not granted");
//			pincode = scan.nextInt();
//		
//		}System.out.println("access granted");
		int secretPincode = 4567;
		int pincode = 0;
		int attempts = 0;
		
		while(pincode != secretPincode) {
			System.out.println("Enter correct pincode");
			pincode = scan.nextInt();
			attempts++;
		if(attempts==3 && pincode != secretPincode) {
		System.out.println("card is blocked");
		return;
		} 
		}
		System.out.println("access granted");
	}
}
