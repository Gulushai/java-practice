package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    //TODO: Write your code below.
	    
	    binary[0]=decimal/128;
	    decimal=decimal%128;
	    binary[1]=decimal/64;
	    decimal=decimal%64;
	    binary[2]=decimal/32;
	    decimal = decimal%32;
	    binary[3] =decimal/16;
	    decimal = decimal%16;
	    binary[4] =decimal/8;
	    decimal = decimal%8;
	    binary[5] = decimal/4;
	    decimal = decimal%4;
	    binary[6]=decimal/2;
	    decimal = decimal%2;
	    binary[7] =decimal;
	    System.out.println(Arrays.toString(binary));		

	}

}
