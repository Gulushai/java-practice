package day21_LoopPractice;

public class convertCharToString {

	public static void main(String[] args) {
		//following ways can be use to convert from chat to string
		char ch = 'a';
		String str1 = ""+ch;
		System.out.println(str1);
		
		char ch2 = 'v';
		String str2 = new String (""+ch2);
		String str3 = Character.toString (ch2);
		System.out.println(str2);
		System.out.println(str3);
	}

}
