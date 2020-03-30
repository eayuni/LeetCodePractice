package pkg1;

import java.util.Arrays;

//646. Maximum Length of Pair Chain
public class MaximumLengthPairChain {
	
	 public static int findLongestChain(int[][] pairs) {
		 System.out.println(Arrays.deepToString(pairs));
		 Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
		 System.out.println(Arrays.deepToString(pairs));
	        int[] dp = new int[pairs.length];
	        for (int i = 0; i < pairs.length; i++) {
	            int j = i - 1;
	            while (j >= 0) {
	                if (pairs[j][1] < pairs[i][0])
	                    break;
	                j--;
	            }
	            if (j < 0)
	                dp[i] = 1;
	            else
	                dp[i] = dp[j] + 1;
	        }
	        return dp[pairs.length - 1];
	    }
	    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]pairs = new int [][] {{1,2},{3,4}, {2,3}};
		System.out.println(findLongestChain(pairs)); 
	}

}
