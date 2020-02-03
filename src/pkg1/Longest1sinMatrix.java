package pkg1;



public class Longest1sinMatrix {
	
	public static int longestMatrix(int matrix[][]) {
		if(matrix.length ==0 || matrix[0].length ==0) {
			return 0;
		}
		int [][] dp = matrix.clone();
		
		int max=0;
		
		for(int i=0;i <matrix.length ; i++) {
			for(int j =0; j<matrix[i].length; j++) {
				if(i==0||j==0) {
					continue;
				}
				else if(matrix[i][j] == 1) {
					dp[i][j] = 1+ Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
				}
				max = Math.max(max, dp[i][j]);
			}
			
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]n =new int[][] {{1,1,0,1,0},{0,1,1,1,0},{1,1,1,1,0},{0,1,1,1,1}};
	
		
		System.out.print(longestMatrix(n));
	}

}
