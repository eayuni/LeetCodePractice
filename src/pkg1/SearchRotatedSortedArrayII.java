package pkg1;



//33. Search in Rotated Sorted Array
public class SearchRotatedSortedArrayII {
	public static boolean search(int[] nums, int target) {
	      int start = 0;
	      int end = nums.length-1;
	      int mid =  (int) Math.floor((start+end)/2);
	      
	     
	      while(start <= end) {
	        	  
	    	  if (nums[mid] == target) {
	    		
		    	  
		    	  return true;
		      }
	    	  else if(target < nums[mid]  ) { 
	    		  
	    		  end = mid;
	    		  mid = (int) Math.floor((start+end)/2);
	    		  
	    	  }
	    	  else if(target > nums[mid]) {
	    		 
	    		  start = mid+1;
	    		  mid = (int) Math.floor((start+end)/2);
	    		  
	    	  }
	    	  
	      }
	      
	      
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int []a =new int[] {1,2,3,4,5,6,7};
		int []a =new int[] {2,5,6,0,0,1,2};
		
		int n=2;
		
		System.out.print(search(a,n));

	}

}
