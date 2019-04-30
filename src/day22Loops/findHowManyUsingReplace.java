package day22Loops;

public class findHowManyUsingReplace {

	public static void main(String[] args) {
		String word = "Time to go home!";
		int length1 = word.length();
		word = word.replace("o","");
		int length2 = word.length();
		
		System.out.println("Length1: "+length1);
		System.out.println("Length2: "+length2);
		
		int count = length1-length2;
		System.out.println("Count of e: "+count);

	}

}
