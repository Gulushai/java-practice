package CodingBat;

public class without2 {

	public static void main(String[] args) {
		String str = "HelloHe";
		String word = "";
		  if(str.substring(0,2).equals(str.substring(str.length()-2))){
		    word = str.substring(2);
		  }else if((str.length()<2)||(str.length()==0)){
		    word = "";
		   }else if(!str.substring(0,2).equals(str.substring(str.length()-2))){
		     word = "";
		   }
		   System.out.println(word);

	}

}
