package homeworks;

import java.util.Scanner;

public class AverageTemperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
		
		for(k =0; k<temps.length; k++) {
			total +=temps[k];
			avgTemp = total/temps.length;
		}
		System.out.println(total);
		System.out.println(avgTemp);
	}

}
