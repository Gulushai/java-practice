package day22Loops;

import java.util.Arrays;

public class SubstringPractice {

	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.substring(0,2));
		
		System.out.println(word.substring(0,word.length()));
		
		System.out.println();
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));
		
		System.out.println();
		for(int n=0; n<=3; n++) {
			System.out.println(word.substring(n, n+1));
		}
		
		System.out.println("************REVERSE*******************");
		for(int j=3; j>=0; j--) {
			System.out.print(word.substring(j, j+1));
		}
		System.out.println();
		int start = 1;
		int end = 5;
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start, end));
		
		String input = "foo"; 
		String reverse ="";
		   for(int i=input.length()-1; i>=0; i--){
		     reverse += (input.substring(i, i+1));
		   }
		   System.out.println(reverse);
		   
		   
		   int[] a = {3, 5, 10};
		   int[] b = {1, 2, 3};
		
		   
		   int[] numbers = new int[a.length+b.length];
		   
		   for(int i=0; i<a.length; i++) {
			   numbers[i] = a[i];
		   }
		   for(int j=0; j<b.length; j++) {
			   numbers[numbers.length-b.length] = b[j];
		   }
//		   int i=0;
//		    for(int num : a){
//		    	numbers[i]= num; 
//		    i++;
//		    }
//		    for(int num : b){
//		    	numbers[i] = num;
//		   i++;
//		    }
//		  
		  
		    System.out.println(Arrays.toString(numbers));
	}

}
