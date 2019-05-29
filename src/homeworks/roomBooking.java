package homeworks;

public class roomBooking {

	public static void main(String[] args) {
		boolean isAvailable = true;
		int month =7;
		int day = 1;
		int year = 2018;
		
		System.out.println(isAvailable && year==2018&&(!(day <=8 && day>=1 && month==7)));
	}

}
