package pkg1;

import java.util.Arrays;

//26. Remove Duplicates from Sorted Array
public class RemoveDuplicatesfromSortedArrayII {
	public static int removeDuplicates(int[] nums, int target) {
        
       Arrays.sort(nums);
       System.out.println(Arrays.toString(nums));
       for(int i=2; i<nums.length; i++){
                     
           if(nums[i] != nums[target-2]){
               
               nums[++target]= nums[i];
               
               
           }
       }
           
       return target;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = new int [] {1,1,1,2,2,3};
		int k = 2;
		System.out.println(removeDuplicates(n,k));

	}

}
