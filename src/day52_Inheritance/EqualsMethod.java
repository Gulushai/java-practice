package day52_Inheritance;

public class EqualsMethod extends Computer{

	public static void main(String[] args) {
		Computer c1 = new Computer("IMac", "silver");
		Computer c2 = new Computer("IMac", "silver");
		Computer c3 = c2; // pointing to same object
		
		System.out.println(c1==c2); //false
		System.out.println(c1.equals(c2)); //true after overriding
		
		System.out.println(c3==c2);
		System.out.println(c3.equals(c2));
	}

}
