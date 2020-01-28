package pkg1;

import java.util.Arrays;

//300. Longest Increasing Subsequence
public class LongestIncreasingSubsequence {
	public static int lengthOfLIS(int[] nums) {
	       
       
        int []dp = new int [nums.length];
        Arrays.fill(nums, 1);
        int i=1;
        int j=0;
        
        if(nums[j]< nums[i]) {
        	dp[i] = Math.max(dp[i], dp[i-1]+1);
        	
        }
        return dp[nums.length];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[] {10,9,2,5,3,7,101,18};
		
	
		
		System.out.print(lengthOfLIS(a));


	}

}
