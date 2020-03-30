package pkg1;

//673. Number of Longest Increasing Subsequence
import java.util.Arrays;


//300. Longest Increasing Subsequence
public class NumberofLongestIncreasingSubsequence {
	public static int lengthOfLIS(int[] nums) {
		   if(nums.length == 0 || nums == null){
	           return 0;
	          
	       }
		   
	        int []dp = new int[nums.length+1];
	        
	        Arrays.fill(dp,1);
	        int max =1;
	        for(int i =1; i < nums.length; i++){
	        	for(int j =0; j<i; j++) {
	        		if(nums[i] < nums[j]) {
	        			  dp[i] = Math.max(max, (dp[i]+1));
	        		}
	        		max =Math.max(max, dp[i]);
	        	}
	            
	        }
	        
	        return max;
	    }
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a =new int[] {10,9,2,5,3,7,101,18};
		//int []a =new int[] {-2,-1};
		
		//int []a =new int[] {1,3,5,4,7};
		int []a =new int[] {2,2,2,2,2};
		System.out.print(lengthOfLIS(a));


	}

}
