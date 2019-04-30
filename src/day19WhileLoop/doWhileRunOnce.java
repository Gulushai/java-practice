package day19WhileLoop;

public class doWhileRunOnce {

	public static void main(String[] args) {
		//in this example, do while loop body code will run 
		//once then test the condition 
		//as condition is false
		int count = 10;
		do {
			System.out.println("count: "+count);
			count++;
		}while (count <=5);

	}

}
