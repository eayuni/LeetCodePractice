package pkg1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//349. Intersection of Two Arrays
public class IntersectionTwoArrays {
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		
		Set<Integer> result  = new HashSet<>();
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int i =0;
		int j =0;
		while(i < nums1.length && j <nums2.length) {
			if(nums1[i] == nums2[j]) {
				result.add(nums1[i]);
				i++;
				j++;
			}
			else if(nums1[i] > nums2[j]) {
				j++;
			}
			else i++;
		}
		
		int [] ans  = new int[result.size()];
		
		int k= 0;
		for(int num : result) {
			ans[k] = num;
			k++;
		}
		
		return ans;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []a =new int[] {9,4,9,8,4};
		int []b =new int[] {4,9,5};
	
		
		System.out.print(Arrays.toString(intersection(a,b)));

	}

}
