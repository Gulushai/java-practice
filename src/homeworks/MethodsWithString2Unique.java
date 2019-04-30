package homeworks;

public class MethodsWithString2Unique {

	public static void main(String[] args) {
		 //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
		  String word1 = "";
		  for(int i=0; i<str.length(); i++) {
			 String letter=""+str.charAt(i);
			  if(!word1.contains(letter)) {
				  word1+=letter;
				  }
			  }
			  
				  return word1;
			  
			  
			  
		  }
			  
		 
	  }

	
