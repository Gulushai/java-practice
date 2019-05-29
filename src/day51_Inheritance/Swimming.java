package day51_Inheritance;

public class Swimming extends Exercise{
	@Override
	public int perform(int minutes) {
		System.out.println("Swimming");
		return minutes*11;
	}
}
