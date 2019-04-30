package day14_String;

public class charAt {

	public static void main(String[] args) {
		String word ="Computer";
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
//		System.out.println(word.charAt(8)); error

		System.out.println(word.length());
		
		String word2 = "Java";
		if(word2.charAt(1) == 'J') {
		System.out.println("J is first char");
		}else {
			System.out.println("J is not first char");
		}
		
		String word3 = "apple";
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		if ((word3.charAt(0)==(word3.charAt(4)))) {
			System.out.println("first and last match");
		}else {
			System.out.println("do not match");
		}
		
		String word4 = "coffee";
//								charAt	(5)
		char lastChar = word4.charAt(word4.length()-1);
			System.out.println("last char: " + lastChar);
		
	}

}
