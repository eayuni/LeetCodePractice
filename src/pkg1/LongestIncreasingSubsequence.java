package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//300. Longest Increasing Subsequence
public class LongestIncreasingSubsequence {
	public static int lengthOfLIS(int[] nums) {
		   if(nums.length == 0 || nums == null){
	           return 0;
	          
	       }
	        int [] dp = new int [nums.length];
	        if(nums.length == 1){
	            return 1;
	        }
	        Arrays.fill(dp, 1);
	              
	        int max = 1;
	        
	        	for( int i= 1; i<= nums.length-1; i++) {
	        		 
	        		for(int j = 0; j < i; j++) {
	        			
	        			
	        			if(nums[i] > nums[j]) {
	        				dp[i]=Math.max(max, dp[i]+1);
	        				
	        				 System.out.println(dp[i]);
	                       
	        			}
	        			
	        		}
	        		
	        		max =Math.max(max, dp[i]);
	        		
	        	}
	        
	        
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[] {10,9,2,5,3,7,101,18};
		//int []a =new int[] {-2,-1};
		
	
		
		System.out.print(lengthOfLIS(a));


	}

}
