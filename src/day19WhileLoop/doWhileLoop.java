package day19WhileLoop;

public class doWhileLoop {

	public static void main(String[] args) {
		// print 1 to 10
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while (i <=10);
		System.out.println();

		// 1+2+3+4+5=15
		int sum =0;
		int j = 1;
		do {
			sum += j;
			j++;
		}while (j<=5);// check the condition at the bottom
		System.out.println("Sum from 1 to 5 is "+sum);
	}

}
