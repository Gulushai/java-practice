package day49_Inheritance;
//TV is a child class in the same package
public class TV extends Device{
	public void watch() {
		System.out.println("Watching TV - "+brand+" model "+model);
		System.out.println("Price: "+price);
	}

}
