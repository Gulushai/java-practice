package homeworks;

import java.util.Scanner;

public class ZombieAttack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int Day =0;
	    while(inhabitants > 0) {
	    	System.out.println("Day "+Day+" ["+ inhabitants +"]");
	    	inhabitants/=2;
	    	Day++;

	    }
	    
	    System.out.println("-----EXTINCT-----");

	}

}
