package pkg1;

import java.util.ArrayList;
import java.util.List;

//315. Count of Smaller Numbers After Self
public class CountSmallerNumbersAfterSelf {
	
	 public static List<Integer> countSmaller(int[] nums) {
	        List<Integer> result = new ArrayList<>();
	        if(nums.length == 0){
	            return result;
	        }
	        
	        
	        for(int i=0; i<nums.length ; i++){
	            int count = 0;
	            for(int j =i+1; j<nums.length; j++){
	                if(nums[i] > nums[j] ){
	                	
	                    count++;
	                }
	            }
	            result.add(i,count);
	        }
	        return result;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[] {5,2,6,1};
		
	
		
		System.out.print(countSmaller(a));
	}

}
