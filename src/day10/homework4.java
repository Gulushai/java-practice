package day10;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//	    
//	    System.out.println("---------------");
//	    System.out.println("select an option:");
//	    System.out.println("1) option 1");
//	    System.out.println("2) option 2");
//	    System.out.println("3) option 3");
//	    System.out.println("---------------");
//	    
//	    int choice = s.nextInt();
//
//	    
//	    //your code here
//	    if (choice==1){
//	      System.out.println("user selected 1");
//	    }
//	    if (choice==2){
//	      System.out.println("user selected 2");
//	    }
//	    if (choice==3){
//	      System.out.println("user selected 3");
//	    }
		
//		Scanner s = new Scanner(System.in);
//	    System.out.println("Enter seconds:");
//	    int inputSeconds = s.nextInt();
//	
//		int hours = inputSeconds/3600;
//	    inputSeconds = inputSeconds%3600;
//	    
//
//	    int minutes = inputSeconds/60;
//	    inputSeconds = inputSeconds%60;
//	    
//	    
//	    int seconds = inputSeconds;
//	    
//	    
//	    
//	   System.out.println(hours + " hours, "+minutes+" minutes, and "+seconds+" seconds");
		System.out.println("Enter number of milligrams in drink:" );
	    Scanner s= new Scanner(System.in);
	    
	    int numberOfMilligrams=s.nextInt();
	    int lethaldose=10000;
	    int drink = lethaldose/numberOfMilligrams;
	    
	    
	    
	    
	    System.out.println("It would take about " + drink +" drinks for a lethal overdose.");
	    
	    
	    
	    
	 
		
  }

	

}

