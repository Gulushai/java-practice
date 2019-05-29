package day51_Inheritance;

public class JiuJitsu extends Exercise{
	@Override
	public int perform(int minutes) {
		System.out.println("JuiJitsu");
		return minutes*12;
	}

}
