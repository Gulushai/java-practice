package day34MethodsReturn;

public class findOccurences {

	public static void main(String[] args) {
		int [] array2 = {3, 5, 6, 3, 7, 6, 3, 5, 3};
		System.out.println(findOccurences(array2, 6));
		System.out.println(findOccurences(array2, 5));
		System.out.println(findOccurences(array2, 3));
		int five = findOccurences(array2, 5);
		System.out.println("5 values: "+five);
		if(findOccurences(array2, 6)>0) {
			System.out.println("We have 6");
		}else {
			System.out.println("No 6s");
		}
		if(findOccurences(array2, 8)>0) {
			System.out.println("We have 8");
		}else {
			System.out.println("No 8s");
		}
		

	}
	public static int findOccurences(int[] array, int value) {
		int count = 0;
		for(int num : array) {
			if(num==value)
				count++;
		}
		return count;
	}

}
