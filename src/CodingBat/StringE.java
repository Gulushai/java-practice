package CodingBat;

public class StringE {

	public static void main(String[] args) {
	String word = "";
	String str = "Hbadello";
	
		int count =0;
		  for(int i=0; i<str.length(); i++){
		    if(str.charAt(i)=='e') {
		    count++;
		    }
		  }System.out.println(count);
		  
		  if(str.length()>3) {
			  word = str.substring(str.length()/2-1, str.length()/2+2);
		  }System.out.println(word);

		 int i = str.indexOf("bad");
		 if(i==1||i==0) {
				  System.out.println(true);
			  }
		  }
	
	
}
