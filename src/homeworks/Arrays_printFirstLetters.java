package homeworks;

import java.util.Scanner;

public class Arrays_printFirstLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		for(String word: arr) {
		System.out.println(word.substring(0,3));
	}
	}
}
