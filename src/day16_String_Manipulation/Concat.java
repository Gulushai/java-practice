package day16_String_Manipulation;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat("+eclipse"));
		
		word=word.concat("  Automation ");
		System.out.println(word);
		
		word = word+" - Cucumber ";
		System.out.println(word);
		
		word = word+ true;
		System.out.println(word);
		
	}

}
