package pkg1;

import java.util.Arrays;

//79. Word Search

public class WordSearch {
	 public static boolean exist(char[][] board, String word) {
		 if(board.length == 0 || word.isEmpty()) {
			 return false;
		 }
		 
		 
		 
		return false;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] ar = new char [][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String n ="ABCCED";
		System.out.println(exist(ar,n));

	}

}
