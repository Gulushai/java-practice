package day39_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class uniqueValues {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10); nums.add(20); nums.add(10); nums.add(7); nums.add(8); 
		nums.add(4); nums.add(8); nums.add(3); nums.add(11); nums.add(3); 

		System.out.println(nums);
		
		//find NON duplicate - unique values. if there 2 AA -> A
		List<Integer> unique1 = new ArrayList<>();
		
		for(Integer num : nums) {
			if(!unique1.contains(num)) {
				unique1.add(num);
			}
		}
		System.out.println(unique1);
		
		List<Integer> unique2 = new ArrayList<>();
		for(int i=0; i<nums.size(); i++) {
			int count =0;
			Integer value = nums.get(i);
				for(int k =0; k<nums.size(); k++) {
					if(nums.get(k) == value && i!=k) {
						count ++;
						break;
					}
				}
				if(count ==0) {
					unique2.add(value);
				}
			}System.out.println(unique2);
		
	}

}
