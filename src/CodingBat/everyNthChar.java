package CodingBat;

public class everyNthChar {

	public static void main(String[] args) {
		String str = "I am smart";
		int a = 3;
		String s = "";
		
		for(int i=0; i<str.length(); i+=3) {
			s=s+str.charAt(i);	
		}
		System.out.println(s);
		
		int first = str.indexOf("I am Smart");
		int last = str.lastIndexOf("I am Smart");
		System.out.println(str.substring(first+1, last));
		
		if(str.endsWith("ly")) {
			System.out.println(true);
		}

	}

}
