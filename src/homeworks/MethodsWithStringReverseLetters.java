package homeworks;

public class MethodsWithStringReverseLetters {

	public static void main(String[] args) {
		String result = reverseLetters("..zxcv..d");
	    System.out.println(result.equals("..dvcx..z")); //true
	    
	    String result2 = reverseLetters("---abmkl.o-");
	    System.out.println(result2.equals("---olkmb.a-")); //true
	    
	    String result3 = reverseLetters("---abmkl.o-");
	    System.out.println(result3.equals("-o.lkmba---")); //false

	}


	  public static String reverseLetters(String word){
//		for(int i=word.length(); i>0; i--) {
//			if(Character.isAlphabetic(i)) {
//			}
//		}
		char[] array = word.toCharArray(); 
		
		char temp = 'A'; 
		int first = 0; 
		int last = word.length()-1;
		
		while(last>first) {
			if(!Character.isLetter(first) || !Character.isLetter(last)) {
				first++;
				last--;
			}else if(Character.isLetter(array[first])) {
				temp = array[first];
				array[first]=array[last];
				array[last]=temp;
				first++;
				last--;
			}
			
		}	return word;
		
	}
}