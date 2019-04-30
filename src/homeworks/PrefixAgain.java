package homeworks;

import java.util.Scanner;

public class PrefixAgain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int n = scan.nextInt();
	    String temp = "";
	    int count =0;
	    
	    for (int i=0; i<n; i++) {
	    	temp = temp+str.charAt(i);
	    }
	    str = str.replace(temp, "$");
	    
	    for(int i=0; i<str.length(); i++) {
	    	if (str.charAt(i)=='$') {
	    	count++;
	    	}
	    }
	    System.out.println(count !=1);
	    

	}

}
