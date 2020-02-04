package pkg1;

//329. Longest Increasing Path in a Matrix
public class LongestIncreasingPathinMatrix {
	
	public static int longestIncreasingPath(int[][] matrix) {
		
		if(matrix.length ==0 || matrix[0].length ==0) {
			return 0;
		}
		int max = 1;
		int [][]dp = new int[matrix.length][matrix[0].length];
		
		for(int i=0; i< matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				max= Math.max(max, dfs(matrix,i,j,dp, Integer.MIN_VALUE));
			}
		}
		
		return max;
	}
	

	
	public static int dfs(int [][]matrix, int i, int j, int [][]dp ,int min) {
		
		if(i< 0 || j<0 || i>=matrix.length || j>=matrix[0].length) {
			return 0;
		}
		
		if(dp[i][j] >= 0) {
			return dp[i][j];
		}
		
		min = dp[i][j];
		int max= 0;
		int left = dfs(matrix,i,j-1,dp,min)+1;
		int right = dfs(matrix,i,j+1,dp,min)+1;	
		int up = dfs(matrix,i-1,j,dp,min)+1;
		int down = dfs(matrix,i+1,j,dp,min)+1;
		
		max= Math.max(right, Math.max(left, Math.max(up, down)));
		dp[i][j] = max;
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]n =new int[][] {{9,9,4},{6,6,8},{2,1,1}};
		//int[][]n =new int[][] {{1,2}};
		
		System.out.print(longestIncreasingPath(n));

	}

}
