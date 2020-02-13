package pkg1;
//63. Unique Paths II
public class UniquePathsII {
	
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
         int n=obstacleGrid[0].length;
         
         int [][] ans = new int[m][n];
         
         if(m == 0 || n==0) return 0;
        
        
        for(int i=0; i<  m; i++){
            for(int j=0; j<n;j++){
            	
            	if(obstacleGrid[i][j] == 1) {
            		ans[i][j]=0;
            		
            	}
            	
            	else if(obstacleGrid[i][j] == 0 ) {
            		if(i ==0 || j==0) {
            			ans[i][j] = 1;
            		}
            		else
                    	ans[i][j] = ans[i-1][j]+ans[i][j-1];
 
            }
        }
      
    }
        return ans[m-1][n-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]m =new int [][] {
			 {0,0,0},
			  {0,1,0},
			  {0,0,0}
		};
		
		int [][]n =new int [][] {{1}};
		int [][]o =new int [][] {{1,0}};
		int [][]p =new int [][] {{0,0},{1,1},{0,0}};
		
		
		System.out.println(uniquePathsWithObstacles(m));
		System.out.println(uniquePathsWithObstacles(n));
		System.out.println(uniquePathsWithObstacles(o));
		System.out.println(uniquePathsWithObstacles(p));

	}

	

}
