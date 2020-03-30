package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//442. Find All Duplicates in an Array

public class FindDuplicatesArray {

		 public static List<Integer> findDuplicates(int[] nums) {
		        
		        List<Integer> result = new ArrayList<>();
		        for(int i =0; i<nums.length; i++){
		        	System.out.println("1: "+nums[i]);
		            int index = Math.abs(nums[i])-1;
		            System.out.println("2:  "+ index);
		            if(nums[index] < 0){
		                result.add(index+1);
		            }
		            else {
		            	nums[index] = -nums[index];
		            }
		            
		            
		            System.out.println(Arrays.toString(nums));
		        }
		        
		        
		        return result;
		        
		    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[] {4,3,2,7,8,2,3,1};
		
	
		
		System.out.print(findDuplicates(a));

	}
}


