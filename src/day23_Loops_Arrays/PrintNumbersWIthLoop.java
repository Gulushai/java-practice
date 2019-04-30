package day23_Loops_Arrays;

public class PrintNumbersWIthLoop {

	public static void main(String[] args) {
		for (int j =1; j<=10; j++) {
			//inner loop
			for (int i =1; i<=j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			}
		
		//reverse order
		
		for (int k =10; k>=1; k--) {
			for (int n = k; n>=1; n--) {
				System.out.print(n);
			}
			System.out.println();
		}

	}

}
