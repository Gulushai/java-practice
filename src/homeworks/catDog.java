package homeworks;

import java.util.Scanner;

public class catDog {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int countOfCats = 0;
		    int countOfDogs = 0;
		    String word = scan.next();
//		    word = word.replace("#", "").replace("!","");
//		    word = word.replace("cat", "#").replace("dog", "!");
//		 for (int i = 0; i < word.length(); i++) {
//			 if(word.charAt(i)=='#') 
//				 countOfCats++;
//			 }
//		 for (int j=0; j <word.length(); j++) {
//			 if(word.charAt(j)=='!')
//			 countOfDogs++;
//			 }		
		    int cats = 0;
		    for( int i=0; i<=word.length()-3; i++) {
		    	System.out.println(word.substring(i, i+3));
		    	if(word.substring(i, i+3).equals("cat")) {
		    		cats++;
		    	}
		    }
					System.out.println("Cats: "+cats);
		 System.out.println(countOfCats == countOfDogs);

	}

}
