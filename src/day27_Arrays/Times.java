package day27_Arrays;

public class Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] time1 = new int[2];
		int[] time2 = new int[2];
		
		time1[0] = 3;
		time2[1] = 15;
		
		time2[0] = 1;
		time2[1] = 10;
		
		//Before comparing, check if both arrays have valid hour / minute
		
		if(time1[0]<0 || time1[0]>23) {
			System.out.println("Time 1 has invalid hour");
			return;
		}
		
		if(time1[1]<0 || time1[1]>59) {
			System.out.println("Time 1 has invalid minute");
			return;
		}
		
		if(time2[0]<0 || time2[0]>23) {
			System.out.println("Time 1 has invalid hour");
			return;
		}
		
		if(time2[1]<0 || time2[1]>59) {
			System.out.println("Time 1 has invalid minute");
			return;
		}
		
		//Compare arrays and tell which one is earlier
		//compare hours
		
		if(time1[0] < time2[0]) {
			System.out.println("Time1 is earlier(hour)");
		}else if(time2[0]<time1[0]) {
			System.out.println("Time2 is earlier(hour)");
		}else {
			if(time1[1] <time2[1]) {
				System.out.println("Time1 is earlier(minute)");
			} else if(time2[1] <time1[1]) {
				System.out.println("Time 2 is earlier(minute)");
			}
		}

	}

}
