package pkg1;

import java.util.PriorityQueue;

//378. Kth Smallest Element in a Sorted Matrix
public class KthSmallestElementSortedMatrix {
	
	 public static int kthSmallest(int[][] matrix, int k) {
		 	int m =matrix.length;
			int n= matrix[0].length;
	        if(matrix.length == 0 || matrix == null) {
	        	return 0;
	        }
	        if( matrix == null || matrix[0].length == 0 ) {
	        	return 0;
	        }
	        
	        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
	        
	        for(int i = 0; i<m; i++) {
	        	for(int j =0;j<n; j++) {
	        		pq.add(matrix[i][j]);
	        		System.out.println(pq);
	        		if(pq.size() > k) {
	        			
	        			pq.poll();
	        			System.out.println("here: "+pq);
	        		}
	        	}
	        }
	        
	        return pq.poll();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]m =new int [][] {
			 { 1,  5,  9},
			  {10, 11, 13},
			  {12, 13, 15}
		};
		int k=8;
		
		System.out.println(kthSmallest(m,k));

	}

}
