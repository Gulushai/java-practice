package OCAprep;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListprep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8));
	Integer s1 = 2;
	//int i=9; it will remove only indexes
	if(list1.remove(s1)) {
		list1.remove(2);
	}
	System.out.println(list1);

}
}