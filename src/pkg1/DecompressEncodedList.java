/**
 * 
 */
package pkg1;

import java.util.Arrays;

/**
 * @author EOTIENO7
 *
 *1313. Decompress Run-Length Encoded List
 */

public class DecompressEncodedList {

	/**
	 * @param args
	 */
	
	 public static int[] decompressRLElist(int[] nums) {
		 int l = 0;
	        for(int n = 0; n < nums.length; n += 2) {
	        	System.out.println("1"+l);
	        	
	        	 System.out.println(nums[n]);
	        	
	            l += nums[n];
	            System.out.println("aaa"+l);
	            
	        }
	        int [] result = new int[l];
	        
	        System.out.println(Arrays.toString(result));
	        
	        int count = 0;
	        
	        for(int n = 1; n < nums.length; n += 2) {
	            for (int k = nums[n-1]; k > 0; k--) {
	                result[count++] = nums[n];
	            }
	        }
	        return result;
	        
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= new int [] {1,2,3,4};
		System.out.println(Arrays.toString(decompressRLElist(nums)));

	}

}
