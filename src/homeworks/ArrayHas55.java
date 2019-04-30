package homeworks;

import java.util.Scanner;

public class ArrayHas55 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO Type your code below:
	    boolean turn = false;
	    for(int i=0; i<nums.length; i++){
	      if((nums[i]==5) && (nums[i+1]==5)){
	        turn = true;
	        break;
	      } else if((nums[i]==5)&&(nums[i+1]!=5)) {
	    	  turn =false;
	    	  break;
	      }
	     
	    } System.out.print(turn);
	   
	    } 
	}
