package day07;

public class comparisonOperators {

	public static void main(String[] args) {
		
		//==
		System.out.println(5 ==5);// true
		
		int searchCount = 5000;
		System.out.println(searchCount = 4000); //false
		
		int expectedCount = 5001;
		System.out.println(searchCount == expectedCount);
		
		int speedLimit = 55;
		int currentSpeed = 75;
		
		System.out.println(currentSpeed == speedLimit);
		
		boolean atLimit = currentSpeed == speedLimit;
		
		System.out.println("at speed limit " + atLimit);
		
		double balance = 150;
		boolean broke = balance <=0.0;
		System.out.println(broke);
		double transaction = 155.5;
		broke = (balance - transaction)<0;
		System.out.println(balance);
		System.out.println(transaction);
		System.out.println(broke);

	}

}
