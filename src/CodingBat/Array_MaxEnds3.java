package CodingBat;

public class Array_MaxEnds3 {

	public static void main(String[] args) {
		int[] nums= {11, 2, 6};
		int[] max = new int[3];
		max[0] = nums[0];
		  if(nums[2]>=max[0]){
			  
		    max[0] = nums[2];
		    max[1] = max[0];
		    max[2] = max[0];
		    
		   
		  }
		  
	if(nums[2]>nums[0]) {
		nums[2]=max;
	}
		  
		  System.out.println(max);
		  

	}

}
