package day14_String;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter 2 words");
//		String word1 = s.next();
//		String word2 = s.next();
//		
//		if (word1.length()>word2.length()) {
//			System.out.println(word1 +" is longer");
//		}else if (word2.length()>word1.length()) {
//			System.out.println(word2+" is longer");
//		}else  {
//			System.out.println("two words are equal");
//		}

//		 Scanner scan = new Scanner(System.in);
//		    String word1 = scan.next();
//		    String word2 = scan.next();
//		    //YOUR CODE HERE
//		    if (word1.length()==3 && word2.length()==3){
//		      System.out.println(word1.charAt(0)+""+word2.charAt(0)+word1.charAt(1)+""+word2.charAt(1)+word1.charAt(2)+""+word2.charAt(2));
//		    }else {
//		      System.out.println("cannot merge");
//		    }
//		 Scanner scan = new Scanner(System.in);
//		    String word = scan.next();
//		    //YOUR CODE HERE
//		    if (word.length()>=5){
//		      System.out.println(word.charAt(2));
//		    }else{
//		      System.out.println("invalid");
//		    }
		    
//		    Scanner scan = new Scanner(System.in);
//		    String word = scan.next();
//		    //YOUR CODE HERE
//		    if (word.length()>=3 && word.length()%2==1){
//		      System.out.println(word.charAt(word.length()/2));
//		    }  		    if (word.length()==1) {
//		    	System.out.print(word+word+word);
//		    }
//		    if (word.length()>=4 && word.length()%2==0) {
//		    	System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2));
//		    }
//		    if (word.length()==2) {
//		    	System.out.println(word+word);
//		    }
		
//		Scanner scan = new Scanner(System.in);
//	    String word = scan.next();
//	    //WRITE YOUR CODE HERE
//	    if (word.length()==5){
//	      System.out.print(word.charAt(4));
//	      System.out.print(word.charAt(3));
//	      System.out.print(word.charAt(2));
//	      System.out.print(word.charAt(1));
//	      System.out.print(word.charAt(0));
//	    }else if(word.length()<=4){
//	      System.out.println("Too short");
//	    }else if(word.length()>5){
//	      System.out.println("Too long");
//	}
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	   // WIRTE YOUR CODE HERE
	    String word = "";
	    if (word1.length()>word2.length()){
	      System.out.println(word1+ " is the longest word");
	    }else if(word2.length()>word1.length()) {
	    	System.out.println(word2+" is the longest word");
	    }
	    //String word = scan.next();
	    System.out.println(word.charAt(word.length()-1));
		    
		   
	}
}
