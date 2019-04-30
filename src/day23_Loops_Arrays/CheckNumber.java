package day23_Loops_Arrays;

public class CheckNumber {

	public static void main(String[] args) {
		for (int i=1;i<=100; i++) {
			if (i==15) {
			break;
			}
			System.out.println("Number "+i);
		}
			
		for (int i=1;i<=100; i++) {
			if (i%2>0) { //(i%5==0) then it will print all numbers beside numbers that are divisible by 5
			continue;
			}
			System.out.println("Number "+i);
		}
		
		for (int n=1; n<=20; n++) {
			if( n>=5 && n<=10) {
				continue;
			}
			System.out.println(n + " numbers from 1 to 20 besides numbers from 5to10");
		}

	}

}
