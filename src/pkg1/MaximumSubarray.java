package pkg1;

import java.util.Arrays;

//53. Maximum Subarray
public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int sum = 0;
        int max= Integer.MIN_VALUE;
        
        for(int i=0; i< nums.length; i++){  
           if(sum < 0) {
        	  max = nums[i];
           }
           else{
        	   sum= sum+nums[i];
           }
           if(max > sum) {
        	   sum = max;
           }
           
        }
       
		return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = new int [] {-2,1,-3,4,-1,2,1,-5,4};
		//int [] nums = new int [] {-2,1};
		System.out.println(maxSubArray(nums));
		

	}

}
