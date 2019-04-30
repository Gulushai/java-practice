package day13;

public class Ternary {

	public static void main(String[] args) {
		
		String quality = "bad";
		int rating = (quality.equals("good")) ? 100: 0;
		System.out.println("Rating " + rating);
		
		int hour = 3;
		//Rush hour during evening : 4-7
		boolean rushHour = hour>=4 && hour<=7 ? true: false;
		System.out.println("rush hour "+ rushHour);
		
		String result = rushHour ? "yes": "no";
		System.out.println(hour + " is rushHour? "+result);
		
		int AMhour = 8;
		String amRushHour = (AMhour>=6 && AMhour<=9) ? "yes" : "no";
		System.out.println(AMhour +" is rush Hour? " + amRushHour);
		
//		if (score > 60) {
//			result = "pass";
//		}else {
//			result = "fail";
//		}
//		result = score>60? "pass" : "fail";
//System.out.println("REsult is " + result);
		
		
		
	}

}
