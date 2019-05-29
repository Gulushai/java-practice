package homeworks;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		String[] arr = {"Cybertek","berat","kumushai","ibrahim"};
		String[] newArr = new String[arr.length];
		int j =0;
		for(int i=arr.length-1; i>=0; i--) {
			newArr[j] = arr[i];
			j++;
			
		}System.out.println(Arrays.toString(newArr));
	}

}
