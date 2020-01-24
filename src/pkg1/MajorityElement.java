package pkg1;

import java.util.HashMap;

//169. Majority Element

public class MajorityElement {
	public static int majorityElement(int[] nums) {
	
	 int ans=0;
	 
	 HashMap<Integer, Integer> map = new HashMap<>();
	 
	 for(int num : nums) {
		 if(!map.containsKey(num)) {
			 map.put(num, 1); 
		 }
		 else {
			 map.put(num,(map.get(num)+1));
		 }
		 
		
		 if(map.get(num) > (nums.length/2)) {
			 
			 ans= num;
		 }
	 }
	
	 
	    
	    return ans;
	    


        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a =new int[] {2,2,1,1,1,2,2};
	
	//int []a =new int[] {3,2,3};
	int []a =new int[] {4,5,4};
	
	
	
	System.out.println(majorityElement(a));

	}

}
