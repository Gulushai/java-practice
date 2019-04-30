package day22Loops;

public class SubstringPractice {

	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.substring(0,2));
		
		System.out.println(word.substring(0,word.length()));
		
		System.out.println();
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));
		
		System.out.println();
		for(int n=0; n<=3; n++) {
			System.out.println(word.substring(n, n+1));
		}
		
		System.out.println("************REVERSE*******************");
		for(int j=3; j>=0; j--) {
			System.out.println(word.substring(j, j+1));
		}
		System.out.println();
		int start = 1;
		int end = 5;
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start, end));

	}

}
