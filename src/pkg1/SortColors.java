package pkg1;

import java.util.Arrays;

//75. Sort Colors
public class SortColors {
	
	public static int[] sortColors(int[] nums) {
		
		int red= 0;
		int blue =0;
		int white =0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 0) {
				red++;
			}
			else if(nums[i] == 1) {
				white ++;
			}
			else
				blue++;
		}
		for(int i=0;i!=nums.length;i++){
			if(i<red){
				nums[i]=0;
			}else if(i<white+red){
				nums[i]=1;
			}else{
				nums[i]=2;
			}
		}
		return nums;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = new int [] {2,0,2,1,1,0};
		System.out.println(Arrays.toString(sortColors(ar)));
	}

}
