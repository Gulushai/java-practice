package day49_Inheritance;

public class Leopard extends Animal{
	public Leopard() {
		super();//call parent class no-agrs constructor
		System.out.println("Leopard Constructor");
		setType("Leopard");
	}
	public Leopard(String type) {
		super(type);//call animal(String type) constructor
		System.out.println("Leopard one arg constructor");
		
	}

}
