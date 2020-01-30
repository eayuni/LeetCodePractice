package pkg1;

import java.util.Arrays;

//88. Merge Sorted Array

public class MergeSortedArray {
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		 int i = m-1, j = n-1, k = m+n-1;
		 
		    while (i>=0 && j>=0) {
		         nums1[k--] = nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
		    }
		    while (i==-1 && j>=0) 
		        nums1[j] = nums2[j--];
		    
		    return nums1;
        }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[] {1,2,3,};
		int n =3;
		int []b =new int[] {2,5,6,};
		int m =3;
	
		
		System.out.print(merge(a,n,b,m));

	}

}
