package day20_ForLoop;

public class PrintEachChar {

	public static void main(String[] args) {
		String word = "United States";
		//using for loop, print each char one by one
		for (int i =0; i<word.length(); i++) {
			System.out.print(word.charAt(i));
		}
		
		//using for loop, print only vowel (a,e,i,o,u)
		System.out.println();
		for (int i =0; i<word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if(letter =='a' || letter =='e' ||letter =='o' ||letter =='i' ||letter =='u') {
				System.out.println(letter);
			}
		}

		//using for loop, print only consonants
		System.out.println();
		for (int i =0; i<word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if(!(letter =='a' || letter =='e' ||letter =='o' ||letter =='i' ||letter =='u')) {
				System.out.println(letter);
			}
		}
	}

}
