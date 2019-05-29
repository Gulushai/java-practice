package day37ArrayList;

import java.util.ArrayList;

public class removeInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList <>();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		
		nums.add(19);
		nums.add(32);
		nums.add(44);
		nums.add(654);
		nums.add(7);
		nums.add(168);
		nums.add(45);
		nums.add(5);
		
		System.out.println(nums.toString());
		nums.remove(5);
		System.out.println(nums);
		
		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(5);
		nums.remove(n1);
		nums.remove(new Integer(2));
		System.out.println(nums);

	}

}
