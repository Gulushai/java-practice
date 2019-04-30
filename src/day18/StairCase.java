package day18;

public class StairCase {

	public static void main(String[] args) {
		String stairs = "*";
		System.out.println();
		
		while (stairs.length() <=20) {
			System.out.println(stairs);
			stairs+="*";
		}
		int num = 1;
		while (num<=10) {
		System.out.println(stairs);
		stairs = stairs + "*";
		num++;
		}

	}

}
