package day17;

import java.util.Scanner;

public class sliceNimber {

	public static void main(String[] args) {
		int num, digit1, digit2, digit3, digit4, digit5;
	    //WRITE YOUR CODE HERE
	    Scanner scan= new Scanner(System.in);
	    System.out.println("Enter your number:");
	    num = scan.nextInt();
	    digit1 = num/10000;
	    num %=10000;
	    digit2 = num/1000;
	    num %=1000;
	    digit3 = num/100;
	    num %=100;
	    digit4 = num/10;
	    num %=10;
	    digit5 = num;
	    
	    System.out.println(digit1+"\n" + digit2+"\n" + digit3+"\n"+digit4+"\n"+digit5);

	    System.out.println("Enter number:");
	    int number=scan.nextInt();
	    int temp=number;
	    int remainder=0;
	    int reverse=0;
	    while(temp>0) {
	    	remainder=temp%10;
	    	reverse=reverse*10+remainder;
	    	temp=temp/10;
	    	
	    	
	   }System.out.println(reverse);
	   
	}

}
