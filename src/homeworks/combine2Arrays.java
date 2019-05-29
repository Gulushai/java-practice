package homeworks;

import java.util.ArrayList;

public class combine2Arrays {

	public static void main(String[] args) {
		
		String[] word1 = {"kjhg", "pear"};
		String[] word2 = {"flower", "sun","kghgjfhttdt", "flower", "sun","kghgjfhttdt", "flower", "sun","kghgjfhttdt", "flower", "sun","kghgjfhttdt"};
		
		System.out.println(combineRs(word1, word2));
	}
	public static String combineRs (String[] r1,String[] r2){
	
	  ArrayList<String> str = new ArrayList<>();
	  String combine ="";
	  for(String s : r1) {
		  str.add(s);
		  
	  }
	  for(String s2 : r2) {
		  str.add(s2);
	  }
	  
	  for(String s3 : str) {
		  combine +=s3;
	  }
	  return combine;
	  
	   
	}

}
