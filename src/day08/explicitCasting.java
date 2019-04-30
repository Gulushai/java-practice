package day08;

public class explicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = (int)(10/2.0);
		
		int rent1 = 12222;
		int rent2 = 2222;
		int rent3 = 3333;
		int rent4 = 4444;
		double average = (double)(rent1 + rent3 + rent2 + rent4)/4;
		
		System.out.println(average);
		
		double d = 40.2;
		int i = (byte)d;
		//in above statement both  explicit and implicit casting happening.
		//explicit: double > byte
		//implicit: byte > int
		
		char ch1='a';
		char ch2='b';
		char ch3='A';
		System.out.println(ch2>ch1);//true
		System.out.println(ch1>ch3);//true
		
		
		
	}

}
