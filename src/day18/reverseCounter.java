package day18;

public class reverseCounter {

	public static void main(String[] args) throws InterruptedException {
		int num =1;
		while(num<=10) {
		System.out.print(num+", ");
		num++;
		Thread.sleep(500);
		}
		System.out.println("result after loop "+num);
		
		int num2 = 11;
		while(num2>1) {
			num2--;
			System.out.print(num2+", ");
			Thread.sleep(500);
		}
	}

}
