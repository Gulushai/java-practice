package homeworks;
import java.util.*;
public class MethodWithArraysAddElements {

	public static void main(String[] args) {
		int[] ints1 = {10, 40, 50, 3, 1};
		int[] ints2 = {11, 0, 500, 44, 1101};
		System.out.println(addElements(ints1,ints2));
	}
	public static int[] addElements(int[] ints1, int[] ints2) {
		int[] result = new int[ints1.length];
		
	    for(int i=0; i<ints1.length; i++) {
	    		result[i] = ints1[i]+ints2[i];
	    		
	    	}
	    	return result;
	    }


}
