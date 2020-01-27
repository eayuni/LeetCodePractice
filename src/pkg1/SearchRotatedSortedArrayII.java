package pkg1;



//33. Search in Rotated Sorted Array
public class SearchRotatedSortedArrayII {
	public static boolean search(int[] nums, int target) {
	      int start = 0;
	      int end = nums.length-1;
	      int mid = Math.floorDiv(start, end);
	      
	      if (nums[mid] == target) {
	    	  return true;
	      }
	      while(start < end) {
	    	  if(target <= nums[mid] && target >nums[start]) {
	    		  end = mid;
	    		  
	    	  }
	    	  else if(target <= nums[end] && target > nums[mid]) {
	    		  start = mid;
	    		  
	    	  }
	    	  
	      }
	      
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int []a =new int[] {1,2,3,4,5,6,7};
		int []a =new int[] {4,5,6,7,0,1,2};
		
		int n=3;
		
		System.out.print(search(a,n));

	}

}
