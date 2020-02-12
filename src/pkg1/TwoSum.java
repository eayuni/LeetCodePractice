package pkg1;

import java.util.Arrays;
import java.util.HashMap;

//1. Two Sum

public class TwoSum {

	 public static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer, Integer> comp = new HashMap<>();
	       
	       for(int i=0; i<nums.length; i++){
	           if(comp.containsKey(nums[i])){
	               int ans = comp.get(nums[i]);
	               
	               return new int[]{ans,i};
	           }
	           else{
	               comp.put(target - nums[i],i);
	           }
	       }
	       return new int[2];
		}
	        
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[] {11,15,2,7};
		int n=9;
		//int []a =new int[] {0,0,3,4};
		
		//int n=0;
		
		System.out.println(Arrays.toString(twoSum(a,n)));

	}

}
