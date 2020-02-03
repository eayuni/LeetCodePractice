package pkg1;

//74. Search a 2D Matrix

public class Search2DMatrix {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int row = matrix.length;
	    if (row == 0) {
	    	return false;
	    }
	    int col = matrix[0].length;
	    int left = 0; 
	    int right = row * col - 1;
	    int mid = 0;
        
	    if (target > matrix[row - 1][col - 1] || target < matrix[0][0]) {
	    	return false;
	    }
	    while (left <= right) {
	    	mid = (left + right) / 2;
	    	if (matrix[mid/col][mid%col] == target) {
	    		
	    		return true;
	    	} else if (matrix[mid/col][mid%col] < target) {
	    		left = mid + 1;
	    	} else {
	    		right = mid - 1;
	    	}
	    }
	    return false;


	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [][]matrix = new int [][] {{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
		int n = 1;
		int [][] matrix = new int [][] {{1}};
		System.out.println(searchMatrix(matrix,n));
	}

}
