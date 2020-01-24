package pkg1;

import java.util.Arrays;

//198. House Robber
public class HouseRobber {
	public static int rob(int[] nums) {
        int maxRob = 0;
        int minRob = 0;
        
        for( int i=0; i<nums.length; i++){
            int currRob= minRob + nums[i];
            maxRob = Math.max(minRob, maxRob);
            minRob= currRob;
            
        }
		return Math.max(minRob,maxRob);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[] {1,2,3,1};
		
	
		
		System.out.print(rob(a));

	}

}
