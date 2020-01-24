package pkg1;
//137. Single Number II
public class SingleNumberII {

	  public static int singleNumber(int[] nums) {
	    	int result=0;
	    	
	    	if(nums.length == 0) {
	    		return 0;
	    	}
	    	
	    	for(int i=0; i<=nums.length-3;i++) {
	    		
	    		
	    		result ^=(nums[i] ^= (nums[i+1] ^= nums[i+2]));
	    		
	    	
	    	}
	            

	    	return result;
	    	
	    }
	    

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int []a =new int[] {0,1,0,1,0,1,2};
			
			System.out.println(singleNumber(a));

		}
}
