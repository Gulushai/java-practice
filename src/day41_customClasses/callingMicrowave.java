package day41_customClasses;

public class callingMicrowave {
	public static void main(String[] args) {
		Microwave info = new Microwave();
		info.brand="Samsung";
		
		info.turnOn();
		info.heatFood("pizza with mushrooms");
		info.turnOff();
	}
	
	

}
