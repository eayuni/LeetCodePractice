package pkg1;

//74. Search a 2D Matrix

public class Search2DMatrix {
	public static boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length == 0 || matrix == null) {
			return false;	
		}
		
		return false;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrix = new int [][] {{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
		int n = 3;
		System.out.println(searchMatrix(matrix,n));
	}

}
