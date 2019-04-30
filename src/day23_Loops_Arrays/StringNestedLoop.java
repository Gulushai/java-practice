package day23_Loops_Arrays;

public class StringNestedLoop {

	public static void main(String[] args) {

//outer loop will repeat printing of letters 
		for (int i = 1; i <=10; i++) {
			//if index is even, print from a till z
			//write a for loop, that will print letter from a to z
			if (i%2==0) {
				for (char letter = 'a'; letter <='z'; letter++) {
					System.out.print(letter);
				}
			//if index is odd, print from z till a
			}else {
				for (char letter = 'z'; letter >='a'; letter--) {
					System.out.print(letter);
				}
			}
			System.out.println();
			System.out.println("********************************");
		}
		

	}

}
