package day13;

import java.util.Scanner;

public class PlayerWins {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    
	    
	    int house = s.nextInt();
	    int player = s.nextInt();
	    
	    //your code here
	if (player==21){
	  System.out.println("busts");
	}else if (house>player){
	  System.out.println("player loss");
	}else if (player==house){
	  System.out.println("its a tie");
	}else if (player>house&&player<21){
	  System.out.println("player wins");
	}else {
		System.out.println("busts");
	}

	}

}
