package day43_Encapsulation;

public class TeslaDealer {

	public static void main(String[] args) {
		Tesla t1 = new Tesla();
		t1.setModel("Model X");
		t1.setRange(400);
		t1.setPrice(150000);
		t1.setZeroTo60(6.4);
		t1.setSelfDriving(false);
		
		System.out.println("Model: "+ t1.getModel());
		System.out.println("Range: "+ t1.getRange());
		System.out.println("0to60: "+ t1.getZeroTo60());
		System.out.println("Price: "+ t1.getPrice());
		System.out.println("Self Driving: "+ t1.isSelfDriving());
		
		System.out.println(t1);
		System.out.println(t1.toString());
		
		Tesla t2 = new Tesla();
		t2.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(t2.toString());
		
		if(t1.getZeroTo60()>t2.getZeroTo60()) {
			System.out.println("Faster model: "+t2.getModel());
			System.out.println("0-60 speed: "+t2.getZeroTo60());
		}else{
			System.out.println("Faster model: "+t1.getModel());
			System.out.println("0-60 speed: "+t2.getZeroTo60());
		}
		
		buy(t2);
		buy(t1);
		testDrive("Model S");
		System.out.println(testDrive("Model X"));
		Tesla testCar = new Tesla();
		System.out.println(testCar.toString());
	}
	
	public static void buy(Tesla car) {
		System.out.println("Purchasing "+car.toString());
	}
	public static Tesla testDrive(String model) {
		
		System.out.println("-I would like to test drive - "+model);
		System.out.println("-Sure, let me build an object and return it");
		Tesla newTesla = new Tesla();
		newTesla.setTeslaInfo(model, 310, 2.5, 95000, false);
		return newTesla;
	}

}
