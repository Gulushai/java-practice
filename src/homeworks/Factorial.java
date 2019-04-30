package homeworks;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    for(int i=1; i<=n; i++) {
	    	if(n!=0) {
	    	n *=i;
	    	continue;
	    	}
	    }
	    System.out.println(n);
	}

}
