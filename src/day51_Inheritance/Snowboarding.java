package day51_Inheritance;

public class Snowboarding extends Exercise{
	public int perform(int minutes) {
		int cal = super.perform(10);//call super class version/method or variable it is perform
		System.out.println("Snowboarding for "+minutes+ " minutes");
		return minutes*7+cal;
	}
	
}
