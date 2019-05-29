package day51_Inheritance;

public class Running extends Exercise{
	@Override
	public int perform(int minutes) {
		System.out.println("Running");
		return minutes*5;
	}

}
