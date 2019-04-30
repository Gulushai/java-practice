package day13;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    
	    System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    String a = s.nextLine();
//	    String b = s.nextLine();
//	    String c = s.nextLine();
	    
	    //your code here
	    a = "venus";
	    String b = "pluto";
	    String c = "neptune";
	  if (a=="a") {
	    System.out.println("a is wrong");
	  } else if(a=="b"){
		System.out.println("b is correct");
	  } else if (a=="c") {
		  System.out.println("c is wrong");
	  }
	  else {
	    System.out.println("is not a valid answer");
	  }
	  

	}

}
