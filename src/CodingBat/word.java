package CodingBat;

public class word {

	public static void main(String[] args) {
		String str = "xiday";
//		String word = "hip";
//		String letters ="";
//		// if word length is longer than str
//		  if(str.substring(1, word.length()).equals(word.substring(1))){
//		    letters = str.substring(0, word.length());
//		  }
//		  System.out.println(letters);
		  
		  
		  String word = "";
		  if(str.startsWith("x")){
		    word = str.substring(1);
		  }else if(str.endsWith("x")){
		    word = str.substring(0,str.length()-1);
		  }
		  System.out.println(word);

	}

}
