package day40ArrayList;

import java.util.ArrayList;
import java.util.List;

public class WarmUpList {

	public static void main(String[] args) {
		String word = "sun";
		ArrayList<String> wo = new ArrayList<>();
		wo.add("flower");
		wo.add("sun");
		wo.add("mulch");
		wo.add("sun");
		System.out.println(countOccurances(wo, word));
		System.out.println(wo.size());
		int count = countOccurances(wo, word);
		if(count ==2) {
			System.out.println("Unit test pass: Count is 2 ");
		}else {
			System.out.println("Unit test fail: Count is count"+ count);
		}
	}
	
	public static int countOccurances(ArrayList<String> words, String word) {
	
	int count =0;
	for(String w : words) {
		if(w.equalsIgnoreCase(word)) {
		count++;
		}
	}
	return count;
	}
}
