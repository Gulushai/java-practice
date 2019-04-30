package day08;

public class ifElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10<100);
		if(10<100) {
			System.out.println("10 is less than 100, true");
		}else {
			System.out.println("condition was false.");
		}
		
		int temperature = 65;
		if (temperature >=65) {
			System.out.println("Its a nice day. Lets code java");
		}else {
			System.out.println("Stay home and practice Java");
		}
		
		int teamAScore = 5;
		int teamBScore = 5;
		
		if (teamAScore > teamBScore) {
			System.out.println("Team A won");
			System.out.println("GO to team A");
		}else {
			System.out.println("team B won or it was a draw");
			System.out.println("GO Team");
		}
		
		
		
	}

}
