package homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_AppendPosSum {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(2, -3, 4, 6, -1, -7));
		System.out.println(appendPosSum(num));

	}
	public static ArrayList<Integer> appendPosSum (ArrayList<Integer> num){
		  ArrayList<Integer> positive = new ArrayList<>();
		  int sum = 0;
		  
		  for(int i=0; i<num.size(); i++) {
			  if(num.get(i)>=0) {
				  positive.add(num.get(i));
				  sum+=num.get(i);
			  }		  
		  }
		  //return positive;
		  num.add(sum);
		  return num;
		}
//	public static void timesTwo(ArrayList<Integer> nums){
//		ArrayList<Integer> toPrint = new ArrayList<>();
//		  for(int i=0; i<nums.size(); i++){
//		    toPrint.add(nums(i*2));
//		    System.out.println(toPrint.toString());;
//		  }
//		}

}
