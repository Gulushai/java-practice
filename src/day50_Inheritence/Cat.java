package day50_Inheritence;

public class Cat extends Animal{
	public void speak() {
		System.out.println("Cat is saying Meow Meaw");
	}
	public void move(int steps) {
		System.out.println("Cat is moving "+ steps + " steps");
	}

}
