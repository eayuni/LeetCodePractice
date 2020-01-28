package pkg1;

import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array

public class FirstandLastPositionSortedArray {
	 public static int[] searchRange(int[] nums, int target) {
		 int[] ans = new int[] {-1,-1};
		 int start =0;
		 int end = nums.length-1;
		 int mid = (int) Math.floor(end/2);
	
		 
		 if(nums.length == 0 || nums == null) {
			 return ans;
		 }
		 
		 while(start < end) {
			 
			 if(nums[mid] == target) {
				 
				
				 if(nums[mid+1]== target) {
					ans[0] = mid;
					ans[1]= mid+1;
					
					return ans;
				 }
				 else
					 ans[0] = mid-1;
					ans[1]= mid;
					return ans;
			 }
			 else if (nums[mid] < target) {
				
				 mid = Math.floorDiv(mid+1, end);
				 start = mid+1;
				 
			 }
			 else {
				
				 mid =Math.floorDiv(start, mid);
				 	end = mid;
			 }
				 
		 }
		 
			 
		return ans;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a =new int[] {1,2,3,4,5,6,7};
				int []a =new int[] {4,5,6,7,7,1,2};
				
				int n=6;
				
				System.out.print(Arrays.toString(searchRange(a,n)));
	}

}
