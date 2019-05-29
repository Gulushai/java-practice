package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListRemoveInstances {

	public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
	  {
	    //int x=r.size();
//	   for(int i = 0; i<r.size(); i++){
//	     
//	       r.remove(n);
//	     
//	   }
		while(r.remove(n)) {
			
		}
	   return r;
	  }
	public static void main(String[] args) {
		  ArrayList<Integer>  arr = new ArrayList<>();
		    Integer[] nums = new Integer[]{1,1,2,3,1,1};
		    arr.addAll(Arrays.asList(nums));
		    
		    System.out.print(removeInst(arr,1));

	}

}
