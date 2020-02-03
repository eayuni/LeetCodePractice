package pkg1;

//74. Search a 2D Matrix

public class Search2DMatrixII {
	public static boolean searchMatrix(int[][] matrix, int target) {
		
	    if (matrix == null || matrix.length == 0 ||  matrix[0].length < 1) {
	    	return false;
	    }
	    int col = matrix[0].length-1;
	    int r =0;   
	  
	    while (col >= 0 && r <= matrix[0].length-1) {
	    	
	    	System.out.println(col+":cccc:"+r);
	    	if (matrix[r][col] == target) {
	    		return true;
	    	} else if (matrix[r][col] < target) {
	    		r ++;
	    	} else {
	    		col --;
	    	}
	    }
	    return false;


	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [][]matrix = new int [][] {{1,   4,  7, 11, 15}, {2,   5,  8, 12, 19}, {3,   6,  9, 16, 22},
		  {10, 13, 14, 17, 24},
		  {18, 21, 23, 26, 30}
	};*/
		int n = 2;
		int [][] matrix = new int [][] {{1,1}};
		System.out.println(searchMatrix(matrix,n));
	}

}
