package day42_CustomClasses_encapsulation;

import java.util.Scanner;

public class StringShoesToObject {

	public static void main(String[] args) {
		String data ="Bruno Magli, 9.5";
		
		//create Shoes 
		String[] arrData = data.split(",");
		//create Shoes object
		shoes Shoes = new shoes();
			Shoes.setShoeData(arrData[0], Double.parseDouble(arrData[1]));
		
		//method
		Shoes.brand = arrData[0];
		Shoes.size = Double.parseDouble(arrData[1]);
		System.out.println(Shoes.getShoesData());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand = scan.next();
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		shoes str = new shoes();
		str.setShoeData(brand, size);
		System.out.println(str.getShoesData());
		
		
		

	}

}
