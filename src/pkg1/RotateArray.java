package pkg1;
//189. Rotate Array

import java.util.Arrays;

public class RotateArray {
	public static int[] rotate(int[] nums, int k) {
        
        int n = nums.length;
        int newPos;
        int [] ar= nums.clone();
        
        for(int i=0; i<n; i++){
            newPos=(i+k)%n;
            
            nums[newPos]= ar[i];
            
                  
        }
        
         for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
		return nums;
        
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a =new int[] {1,2,3,4,5,6,7};
		
		int n=3;
		
		System.out.print(Arrays.toString(rotate(a,n)));

	}

}
