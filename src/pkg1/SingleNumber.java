package pkg1;

//136. Single Number

public class SingleNumber {
    public static int singleNumber(int[] nums) {
    	int result=0;
    	if(nums.length == 0) {
    		return 0;
    	}
    	
    	for(int i=0;i<=nums.length-1;i++) {
    		
    		
    		result ^= nums[i];
    	
    	}
            

    	return result;
    	
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[] {4,1,2,1,2};
		
		System.out.println(singleNumber(a));

	}

}
