package homeworks;

import java.util.Scanner;

public class ArraysFindingMaxLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		
		int maxWord = 0;
		int index =0;
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
			}
		for(int j =0; j < words.length; j++) {
			
			if(words[j].length()<maxWord) {
				maxWord = words[j].length();
				index = j;
				
		}
		}System.out.println(words[index]);
		
		

	}

}
