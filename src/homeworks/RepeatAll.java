package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatAll {

	public static void main(String[] args)
	{
		ArrayList<Boolean> bool = new ArrayList<>();
		bool.add(true);
		bool.add(false);
		bool.add(true);
		repeatAL(bool);
	}
	public static void repeatAL(ArrayList<Boolean> bool1) {
		bool1.addAll(bool1); 
		System.out.println(bool1);
	}

}
