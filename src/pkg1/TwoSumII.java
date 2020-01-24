package pkg1;

import java.util.Arrays;

//167. Two Sum II - Input array is sorted

public class TwoSumII {

	 public static int[] twoSum(int[] numbers, int target) {
		  int start = 0;
			int end = numbers.length-1;
					
			while(start<end) {			
				int compliment = numbers[start] + numbers[end];
				
					
				if(compliment == target) {
						
				break;			
				}
					
				else if(compliment > target) {
					
						end--;
				}
				else {
					System.out.println(start);	
						start++;
					}
							
			}			 
			 
			 return new int[]{start + 1, end + 1};
	    }
	        
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a =new int[] {2,7,11,15};
			//int n=9;
		int []a =new int[] {0,0,3,4};
		
		int n=0;
		
		System.out.println(Arrays.toString(twoSum(a,n)));

	}

}
