package day04;

public class EscapeSequence {

	public static void main(String[] args) {
		
		System.out.println("Would you like \'coffe\' or \'tea\'?");
		System.out.println("\"\\__/\"");
		//double quotes ("") =>\"
		//single quotes (') => \'
		// New Line => \n
		//Tab => \t
		//Backslash => \\
		// "Hello" => \"Hello\"
		// \" => print double quote (")
		System.out.println("java\nselenium");
		
		int apples = 25;
		int kiwis = apples;
		int mangoes = 55;
		kiwis = mangoes;
		
		System.out.println(mangoes);
		System.out.println(kiwis);
		System.out.println(apples);
	}

}
