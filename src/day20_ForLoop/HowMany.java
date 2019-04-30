package day20_ForLoop;

public class HowMany {

	public static void main(String[] args) {
		// word
		// char to count the number of occurrences
		
		String word ="computer programming";
		char myChar = 'g';
		int counter = 0;
		for (int i =0; i < word.length(); i++) {
			if(word.charAt(i) ==myChar) {
			
			counter++;
			}
		}
		System.out.println("Count: "+counter);
	}

}
