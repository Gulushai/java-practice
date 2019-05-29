package day52_Inheritance;

public class FinalMethods {
	public final void method1() {
		System.out.println("Final methods 1");
	}
	
	public final static void staticMethod(String word) {
		System.out.println("static method "+ word);
	}
}
class Sub extends FinalMethods{
	// cannot override since it is a final method.
//	public void method1() {
//		System.out.println("Overrided Final methods 1");
//	}
	
	public final void method1(String name) {
		System.out.println("Final methods 1");
	}
}
