package pkg1;

public class FindMininRotatedSortedArray {
	 public static int findMin(int[] nums) {
		 if(nums.length == 0 ||nums == null) {
			 return 0;
		 }
		 
		 int start = 0;
		 int end = nums.length-1;
		 int mid =0;
		 
		 while(start < end) {
			 mid = (int) Math.floor((start+end)/2);
			 if(nums[mid] > nums[end]) {
				
				 start = mid+1;
				
			 }
			 else {
				 
				 end = mid;
				
			 }
		 }
		 
		 
		 
		return nums[end];
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a =new int[] {3,4,5,1,2};
		int []a =new int[] {2,3,4,5,1};
		
	
		
		System.out.print(findMin(a));
	}

}
