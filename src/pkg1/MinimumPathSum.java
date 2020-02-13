package pkg1;

import java.util.Arrays;

//64. Minimum Path Sum
public class MinimumPathSum {
	
	 public static int minPathSum(int[][] grid) {
	        int m = grid.length;
	        int n= grid[0].length;
	        
	        if(grid == null || m == 0 || grid[0] == null || n == 0)
	        	return 0;
	        
	        for(int i = 1; i < m; i++){
	            grid[i][0] = grid[i][0] + grid[i-1][0];
	        }
	        for(int j = 1; j < n; j++){
	            grid[0][j] = grid[0][j] + grid[0][j-1];
	        }
	        
	        for(int i=1; i<m; i++){
	            for(int j=1; j<n;j++){
	            	
	                    grid[i][j] = grid[i][j] + Math.min(grid[i-1][j],grid[i][j-1]);
	            }
	        }
	        return grid[m-1][n-1];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]m =new int [][] {
			 {1,3,1},
			  {1,5,1},
			  {4,2,1}
		};
		
		System.out.println(minPathSum(m));

	}

}
