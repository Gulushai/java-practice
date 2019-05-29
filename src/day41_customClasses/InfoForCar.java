package day41_customClasses;

public class InfoForCar {

	public static void main(String[] args) {
		car info = new car();
		info.make = "Toyota";
		info.model = "Highlander";
		info.color = "chocolate";
		info.currentSpeed = 110;
		
		info.printCarInfo();
		info.showCurrentSpeed(80);
		
		System.out.println();
		System.out.println("Car name is " + info.make);
		System.out.println("Car model is " + info.model);
		System.out.println("Car color is " + info.color);
		System.out.println(("Cars current speed is "+ info.currentSpeed));
		System.out.println();
		
		info.drive();
		info.accellerate(25);
		
		BMW bmw = new BMW();
		System.out.println(bmw.make);
		bmw.model = "m3";
		bmw.showPrice();
		System.out.println("Car Price: "+bmw.price);
	}

}
