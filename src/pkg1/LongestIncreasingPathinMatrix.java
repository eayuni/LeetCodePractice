package pkg1;



//329. Longest Increasing Path in a Matrix
public class LongestIncreasingPathinMatrix {
	
	public static int longestIncreasingPath(int[][] matrix) {
		
		if(matrix.length ==0 || matrix[0].length ==0) {
			return 0;
		}
		int max=1;
		int [][]dp = new int[matrix.length][matrix[0].length];
		fillArray(dp,1);
		for(int i=0; i< matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(i==0 || j==0) {
					continue;
				}
				else {
					dp[i][j] = 1+Math.max(dp[i-1][j],Math.max(dp[i][j-1], dp[i-1][j-1]));
					
				}
				max= Math.max(max, dp[i][j]);
			}
			
		}
		
		return max;
        
    }
	
	public static void fillArray(int[][] dp , int n){
	    for (int i = 0; i < dp.length; i++){
	    	for(int j=0; j<dp[i].length;j++) {
	    		dp[i][j]= 1;
	    	}
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[][]n =new int[][] {{9,9,4},{6,6,8},{2,1,1}};
		int[][]n =new int[][] {{1,2}};
		
		System.out.print(longestIncreasingPath(n));

	}

}
