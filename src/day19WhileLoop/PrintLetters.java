package day19WhileLoop;

public class PrintLetters {

	public static void main(String[] args) {
		String word ="Amazon";
		//Print each character one by one 
		int idx = 0;
		while(idx<word.length()) {
			System.out.print(word.charAt(idx));
			idx++;
		}
		String word1 ="java";
		//Print each character one by one 
		int index = word1.length()-1;
		while(index>=0) {
			System.out.println();
			System.out.print(word1.charAt(index));
			index--;
		}

	}

}
