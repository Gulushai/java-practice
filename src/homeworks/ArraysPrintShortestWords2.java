package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintShortestWords2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    String[] arr = str.split(", ");
	    
	    String sh = arr[0];
	    for( int i =0; i<arr.length; i++) {
	    	if(arr[i].length()<sh.length()) {
	    		sh=arr[i];
	    		//index = i;
	    	}
	    }
	    String shortest = "";
	    for ( int i = 0; i<arr.length; i++) {
	    	if(sh.length()==arr[i].length()) {
	    		shortest+=arr[i]+",";
	    	}
	    }
	    String[] shortestWords= shortest.split(",");
	    Arrays.sort(shortestWords);
	    
	    System.out.println(Arrays.toString(shortestWords));
	}

}
