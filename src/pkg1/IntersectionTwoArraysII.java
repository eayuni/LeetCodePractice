package pkg1;

import java.util.Arrays;
import java.util.HashMap;

350. Intersection of Two Arrays II
public class IntersectionTwoArraysII {
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		 HashMap<Integer, Integer> result = new HashMap<>();
	        
	        if(nums1.length == 0 || nums2.length ==0){
	            return null;
	        }
	        
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        
	        int i=0;
	        int j=0;
	        
	        while(i < nums1.length && j< nums2.length){
	        	int count =0;
	            if(nums1[i] == nums2[j]){
	            	
	            	count++;
	            	
	            	if(result.containsKey(nums1[i])) {
	            		
	            		result.put(result.get(nums1[i]), count++);
	            		i++;
	            		j++;
	            		
	            		
	            	}
	            	else
	            
		                result.put(nums1[i], count);
		                i++;
	            		j++;
	            }
	            else if(nums1[i] > nums2[j]) {
	            	j++;
	            }
	            else
	            	i++;
	            	
	        }
	        //System.out.println(result.values());
	        int [] ans  = new int[result.size()];
			
			int k= 0;
			for(int num : result.keySet()) {
				ans[k] = num;
				k++;
			}
			
			return ans;
	        
	        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []a =new int[] {1,2,2,1};
		int []b =new int[] {2,2};
	
		
		System.out.print(Arrays.toString(intersection(a,b)));

	}

}
