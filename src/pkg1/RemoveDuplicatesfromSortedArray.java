package pkg1;

import java.util.Arrays;

//26. Remove Duplicates from Sorted Array
public class RemoveDuplicatesfromSortedArray {
	public static int removeDuplicates(int[] nums) {
        int n = 0;
       Arrays.sort(nums);
       
       for(int i=0; i<nums.length; i++){
          
           
           if(nums[i] != nums[n]){
               
               nums[++n]= nums[i];
               
           }
       }
       return ++n;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = new int [] {1,1,2};
		System.out.println(removeDuplicates(n));

	}

}
