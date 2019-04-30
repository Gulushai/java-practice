package day26_Arrays;

public class StringPractice {

	public static void main(String[] args) {
		
		String word = "java";
		word = word.toUpperCase();
		
		String word2 = new String ("java");
		word2 = word2.toUpperCase();
		System.out.println(word);
		System.out.println(word2);
		System.out.println(word == word2); //false
		
		System.out.println(word.equals(word2));//true. Because equals method checks value

	}

}
