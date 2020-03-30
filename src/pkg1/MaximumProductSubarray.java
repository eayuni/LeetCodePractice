package pkg1;

import java.util.Arrays;

//53. Maximum Subarray
public class MaximumProductSubarray {
	
	public static int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        
        int [] dp = nums.clone();
     
        int max =  dp[0];
        for(int i=1; i < nums.length; i++){  
           dp[i]= Math.max(nums[i], (nums[i]*dp[i-1]));
           System.out.println(Arrays.toString(dp));
           System.out.println(dp[i]);
           max = Math.max(max, dp[i]);
           System.out.println(max);
        }
       
		return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] nums = new int [] {-2,1,-3,4,-1,2,1,-5,4};
	//int [] nums = new int [] {8,-19,5,-4,20};
		//int [] nums = new int [] {1,-1,1};
		int [] nums = new int [] {-2,3,-4};
		System.out.println(maxSubArray(nums));
		

	}

}
