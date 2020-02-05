package pkg1;
//215. Kth Largest Element in an Array


import java.util.PriorityQueue;

public class KthLargestElementArray2 {
	
	public static int findKthLargest(int[] nums, int k) {
        
        if(nums.length == 0){
            return 0;
        }
       PriorityQueue<Integer> minHeap = new PriorityQueue<>(k+1);
       
       for(int el : nums) {
    	   minHeap.add(el);
    	   System.out.println(minHeap);
    	   
           if (minHeap.size() > k) {
        	   minHeap.poll();
           	   System.out.println(minHeap);
        	   System.out.println("++++");
           }
       }

       return minHeap.poll();
	
     
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]= new int[] {5,4,2,3,6,1};
		
		int k =2;
			
			//System.out.println(Arrays.toString(A));
		System.out.println(findKthLargest(A,k));

	}

}
