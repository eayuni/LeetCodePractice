package pkg1;
//414. Third Maximum Number


import java.util.PriorityQueue;

public class ThirdMaximumNumber {
	
	public static int findKthLargest(int[] nums, int k) {
        
		 if(nums.length == 0){
	            return 0;
	        }
	       PriorityQueue<Integer> minHeap = new PriorityQueue<>(k+1);
	      int max = 0;
	       
	       for(int el : nums) {
	    	   if(!minHeap.contains(el)) {
	    		   minHeap.add(el);
	    	   }
	    	System.out.println(minHeap.size());
	    	System.out.println(minHeap);
	    		if (minHeap.size() > k) {
	        	 minHeap.poll();
	        	  
	           }
	           else
	           {
	        	   max= Math.max(max, minHeap.poll());
	           }
	       }
	           
	          
       
	       
	       return max;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int A[]= new int[] {3,2,1,5,6,4};
		//int A[]= new int[] {1,2};
		int A[]= new int[] {5,2,2};
		int k =3;
			
			//System.out.println(Arrays.toString(A));
		System.out.println(findKthLargest(A,k));

	}

}
