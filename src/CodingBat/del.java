package CodingBat;

import java.util.Scanner;

public class del {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(str.length()<=3) {
			System.out.println(str);
		}else if(str.substring(1, 4).equals("del")) {
			str = str.substring(0, 1)+str.substring(4);
		}System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
//		String word = str.replace("del", "$");
//		String result = "";
//		
//			if(word.charAt(1)=='$') {
//			result = word.replace("$", "");
//				System.out.println(result);
//			}
//		System.out.println(str);
	}

}
