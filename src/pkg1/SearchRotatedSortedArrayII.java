package pkg1;



//33. Search in Rotated Sorted Array
public class SearchRotatedSortedArrayII {
	public static boolean search(int[] nums, int target) {
	      int start = 0;
	      int end = nums.length-1;
	     if(nums.length == 0) {
	    	 return false;
	     }
	     if(nums.length == 1) {
	    	 if(nums[0]== target) {
	    		 return true;
	    	 }
	    	 else
	    		 return false;
	     }
	      	     
	      while(start <= end) {
	    	  int mid = (int) Math.floor((start+end)/2);
	    	  if (nums[mid] == target) { 
		    	  return true;
		      }
	    	  else if(target <= nums[mid]  ) { 
	    		  end = mid;
	    	  }
	    	  else if(target > nums[mid]) {
	    		  start = mid+1;	  
	    	  }  
	      } 
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int []a =new int[] {1,2,3,4,5,6,7};
		//int []a =new int[] {2,5,6,0,0,1,2};
		int []a =new int[] {1,1};
		
		int n=0;
		
		System.out.print(search(a,n));

	}

}
