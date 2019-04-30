package day23_Loops_Arrays;

import java.util.Scanner;

public class loopThroughTheNums {

	public static void main(String[] args) {
		
		
		for(int i =1; i<=50; i++) {
			if ((i%5==0) && (i%20 !=0)) {
				continue;
			}
			if(i%20 ==0) {
				break;
			}
			System.out.print(i + ",");
		}

	}

}
