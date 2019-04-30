package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInnerAndOuter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for(int i =0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for(int j =0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		//WRITE YOUR CODE HERE
		
		boolean result =false;
		for(int i=0; i<inner.length; i++) {
			for(int j=0; j<outer.length; j++) {
				if(inner[i]==outer[j]) {
					result=true;
					break;
				}else {
					result=false;
				}
			}
			if(result==false) {
				break;
			}
		}
		System.out.println(result);
		
		
		
		
		
		

	}

}
