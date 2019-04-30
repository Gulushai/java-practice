package day18;

public class abcd {

	public static void main(String[] args) throws InterruptedException {
		char letter= 'a';
		System.out.print(letter);
		letter++;
		System.out.print(letter);
		letter++;
		System.out.println(letter);

		char letters = 'a';
		while(letters<='z') {
			System.out.print(letters+ " ");
			letters++;
		}System.out.println(" ");
		
		char LETTER = 'A';
		while(LETTER <='Z') {
			System.out.print(LETTER+" ");
			LETTER++;
		}System.out.println(" ");
		
		char reverse = 'z';
		while(reverse >='a') {
			System.out.print(reverse +" ");
			reverse--;
		}System.out.println(" ");
		System.out.println(" ");
		
		char REVERSE = 'Z';
		while(REVERSE >='A') {
			System.out.print(REVERSE + " ");
			REVERSE--;
			
		}
		System.out.println();
		String lettters = "";
		lettters = lettters+'A';
		System.out.println(lettters);
		
		lettters = lettters+'B';
		System.out.println(lettters);
		
		lettters = lettters+'C';
		System.out.println(lettters);
		
		System.out.println();
		char myLetter = 'A';
		while (myLetter <='Z') {
		lettters = lettters+myLetter;
		System.out.println(lettters);
		myLetter++;
		}
	}

}
