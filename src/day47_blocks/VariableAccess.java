package day47_blocks;

public class VariableAccess {
	//instance Variable
	int myInstanceVar = 40;
	//static variable
	static int myStaticVar = 55;
	
	public static void main(String[] args) {
		//System.out.println(myInstanceVar); cannot access non static variable
		System.out.println(myStaticVar);
		
		//access non-static variable by creating an object
		VariableAccess v = new VariableAccess();
		System.out.println(v.myInstanceVar);
		System.out.println(v.myStaticVar);
		
		//access static variable using class name
		System.out.println(VariableAccess.myStaticVar);
		
	}
}
