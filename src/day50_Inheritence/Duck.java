package day50_Inheritence;

public class Duck extends Animal{
	public void speak() {
		System.out.println("Duck is saying Quack Quack");
	}
	public void move(int steps) {
		System.out.println("Duck is moving "+ steps + " steps");
	}

}
