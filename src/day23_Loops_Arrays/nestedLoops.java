package day23_Loops_Arrays;

public class nestedLoops {

	public static void main(String[] args) {
		// This is just to print numbers from 1 to 10
		
//		for (int i =1; i<=10; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i =1; i<=10; i++) {
//			System.out.print(i + " ");
//		}
		
		//outer loop
		for (int k =1; k<=3; k++) {
			//inner loop
			for (int j =1; j<=2; j++) {
				//inner loop
				System.out.println();
				for (int i =1; i<=10; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
				}
		System.out.println("*******************");
		}
	}

	}
