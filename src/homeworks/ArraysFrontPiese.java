package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFrontPiese {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {   
			num[i] = scan.nextInt();	
		}
		//WRITE YOUR CODE HERE
		
    if(num.length<=1){
      System.out.println(Arrays.toString(num));
    }else if(num.length>=2) {
    	int[] result = new int[2];
    	
    	for(int i =0; i<result.length; i++) {
    		result[i]=num[i];
    	
    	}System.out.println(Arrays.toString(result));
    }   
	}
	
}