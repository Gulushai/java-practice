package day07;

public class PreAndPost {

	public static void main(String[] args) {
		
//		int num = 0;
//		int num2= num++;
//		
//		System.out.println("num: " +num);
//		System.out.println("num2: " +num2);
//		
//		int n = 0;
//		int n2 = ++n;
//		
//		System.out.println("n: "+n);
//		System.out.println("n2: "+n2);
//		
//		int bananas = 6; //7
//		int apples = bananas ++;//6
//		int pears = ++bananas; //8
//
//		System.out.println("bananas " +bananas);//8
//		System.out.println("apples " + apples);//6
//		System.out.println("pears " + pears);//8
		
//		int p1 = 10;
//		int sum = p1++ +5;
//		
//		System.out.println("sum: " + sum);
//		System.out.println("p1: " + p1);
		
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		
		System.out.println("battersies: " + batteries); //9
		System.out.println("oldBatteries: " + oldBatteries); //6
		System.out.println("totalBatteries: " + totalBatteries); //14
		
		
	}

}
