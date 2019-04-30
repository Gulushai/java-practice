package day20_ForLoop;

public class indexOf {

	public static void main(String[] args) {
		String word = "Amazon";
		char letter = 'm';
		int index = -1;
		//using for loop - look for the letter
		//if it is a match assign value to index
		//exit for loop
		//print value of index
		for (int i =0; i < word.length(); i++) {
			if(word.charAt(i) == letter) {
				index = i;
				break;
			}
		}
		System.out.println("Index "+index);
		
	}

}
