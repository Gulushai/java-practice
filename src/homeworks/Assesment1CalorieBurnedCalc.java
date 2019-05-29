package homeworks;

import java.util.Scanner;

public class Assesment1CalorieBurnedCalc {

	public static void main(String[] args) {
			    double weight = 0;
			    double cal = 0;
			    Scanner scan = new Scanner(System.in);
			    System.out.println("Enter weight in pounds:");
			    
			    weight = scan.nextInt();
			    
			    double running = 0.0175*10*30*(weight/2.2);
			    double basketball = 0.0175*8*30*(weight/2.2);
			    double sleeping = 0.0175*1*(6*60)*(weight/2.2);
			    
			    int totalCal = (int)(running +basketball+sleeping);
			    
			    System.out.println(totalCal);
			    

	}

}
