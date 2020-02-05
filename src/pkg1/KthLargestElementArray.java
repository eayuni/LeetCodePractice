package pkg1;
//215. Kth Largest Element in an Array

import java.util.Arrays;

public class KthLargestElementArray {
	
	public static int findKthLargest(int[] nums, int k) {
        
        if(nums.length == 0){
            return 0;
        }
        int len =nums.length;
        Arrays.parallelSort(nums);
        
        
		return nums[len-k];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]= new int[] {3,2,1,5,6,4};
		
		int k =2;
			
			//System.out.println(Arrays.toString(A));
		System.out.println(findKthLargest(A,k));

	}

}
