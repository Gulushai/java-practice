package homeworks;

import java.util.Scanner;

public class ArraySplitReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    String[] arr = sentence.split(" ");
	    String reversed = "";
	    //TODO: start your code here
	    for(int i=arr.length-1; i>=0; i--){
	      if( i==0) {
	      reversed += arr[i];
	   
	    }else {
	    	reversed += arr[i]+" ";
	    }
	}
	    System.out.println(reversed);
	    
	}
}
