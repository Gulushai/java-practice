package day50_Inheritence;

public class Dog extends Animal{
	public void speak() {
		System.out.println("Dog is saying Guf Guf");
	}
	public void move(int steps) {
		System.out.println("Dog is moving "+ steps + " steps");
	}
}
