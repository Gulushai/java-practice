package day32ArraysMethods;

public class ArrayContains {

	public static void main(String[] args) {
		int[] arr1 = {5,7,1};
		int[] arr2 = {20, 5, 22, 4, 7};
		
		
		for( int n1: arr1) {
			int count =0;
			for(int n2: arr2) {
				if (n1==n2) {
					System.out.println("FOUND!!! "+ n1 + " is there");
					count++;
				} 
				
			}
			if(count == 0) {
			System.out.println("did not found " +n1 + " in arr2");
			}
		}
			
	}

}
