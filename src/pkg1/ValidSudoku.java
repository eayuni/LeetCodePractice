package pkg1;
//36. Valid Sudoku
public class ValidSudoku {

	public static boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<board.length ; i++) {
        	for(int j =0; j<i; j++) {
        		if()
        	}
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] board = new char[][] {
		                               {'5','3','.','.','7','.','.','.','.'},
		                               {'6','.','.','1','9','5','.','.','.'},
		                               {'.','9','8','.','.','.','.','6','.'},
		                               {'8','.','.','.','6','.','.','.','3'},
		                               {'4','.','.','8','.','3','.','.','1'},
		                               {'7','.','.','.','2','.','.','.','6'},
		                               {'.','6','.','.','.','.','2','8','.'},
		                               {'.','.','.','4','1','9','.','.','5'},
		                               {'.','.','.','.','8','.','.','7','9'}
		                             };

	System.out.println(isValidSudoku(board));

}
}
