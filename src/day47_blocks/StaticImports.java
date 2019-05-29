package day47_blocks;

import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.Arrays;
import static java.time.LocalDateTime.now;

public class StaticImports {
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(max(10,5));
		System.out.println(min(11, 100));
		System.out.println(floor(4.432));
		System.out.println(round(23.909));
		System.out.println(abs(-10));
		System.out.println(pow(31, 2));
		System.out.println(sqrt(5));
		System.out.println(random()*10);
		//===================================
		
		System.out.println(isDigit('4'));
		System.out.println(isAlphabetic('j'));
		
		int[] nums = {34, 234, 543, 23, 2, 54};
		//sort.nums();
		System.out.println(Arrays.toString(nums));
		
		System.out.println(now());
		
	}

}
