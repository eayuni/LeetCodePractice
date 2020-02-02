package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//78. Subsets

public class Subsets {
	 public static List<List<Integer>> subsets(int[] nums) {
		 List<List<Integer>> result = new ArrayList<>();
		 List<Integer> subset = new ArrayList<>();
		 if(nums.length == 0) {
			 return result;
		 }
		 Arrays.sort(nums);
		 findSubsets(nums,result,subset,0);
		 
		return result;
	        
	    }
	 
	 private static void findSubsets(int [] nums, List<List<Integer>> result, List<Integer> subset, int start) {
		 result.add(new ArrayList<>(subset));
		 
		 for(int i=start; i< nums.length; i++) {
			 subset.add(nums[i]);
			 findSubsets(nums,result,subset,i+1);
			 subset.remove(subset.size()-1);
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = new int [] {1,2,3};
		System.out.println(subsets(n));
	}

}
