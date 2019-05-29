package CodingBat;

public class endUpperCase {

	public static void main(String[] args) {
		String str = "hello world";
		String s ="";
		s=(str.substring(0,str.length()-3))+str.substring(str.length()-3).toUpperCase();
		System.out.println(s);
	}

}
