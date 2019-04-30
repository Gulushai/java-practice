package day31_Methods;

public class CheckIfInArray {

	public static void main(String[] args) {
		int n = 55;
		int nums[]= {21, 11, 31, 42, 24, 55};
		boolean present = false;
		for(int i : nums) {
			if(i==n) {
				present =true;
				break;
			}
		}
		System.out.println("Is "+n+" present - "+present);
	}

}
