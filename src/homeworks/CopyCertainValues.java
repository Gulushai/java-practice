package homeworks;

import java.util.Arrays;

public class CopyCertainValues {

	public static void main(String[] args) {
		System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  }
	  public static String[] getWithE(String[] arr) {
	  //TODO : YOUR CODE GOES HERE ----------------------
		  
		  String temp = "";
		  for(String words1: arr) {
			  if(words1.contains("e")) {
				  temp += words1 + " ";
			  }
		  }
		  temp = temp.trim();
		  String[]fewValues = temp.split(" ");
		//YOUR CODE ENDS HERE -----------------------
		  
	
		  return fewValues;
	}

}
