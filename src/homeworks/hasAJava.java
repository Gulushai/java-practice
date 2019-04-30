package homeworks;

import java.util.Scanner;

public class hasAJava {

	private static final String OUTER_LOOP = null;

	public static void main(String[] args) {
		    boolean exists = false;
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
		    
		    
		    if(word.contains("java")){
		        word=word.replace("java", "#");
		        if(word.indexOf("#")<=1){
		            exists = true;
		            
		        }System.out.println(exists);
		        
		   }else if(!word.contains("#")) {
			    System.out.println(false);
			    
		   }
	}
}
