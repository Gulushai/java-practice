package homeworks;

import java.util.Scanner;

public class Party {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 String answer="Yes";
		 String newName="";
		 while(answer.equalsIgnoreCase("Yes")) {
			 System.out.println("Please enter guest name:");
			 String name=input.next();
			 
			 newName=newName+ ", "+name;
			 newName=newName.substring(1);
			 System.out.println("Do you want to enter new guest name:");
			 answer=input.next();
			 
		 }
		 
		 System.out.println("Guest's list:" + newName);
	}

}
