package pkg1;

//287. Find the Duplicate Number

public class FindDuplicateNumber {

	 public static int findDuplicate(int[] nums) {
		 if(nums.length ==0 )
             return 0;
         int slow=0, fast=0;
         slow = nums[slow];
         fast = nums[nums[fast]];
         
      
         
         while(slow != fast){
             if(slow == nums[slow])
                 return slow;
             slow = nums[slow];
             fast = nums[nums[fast]];
         }
         fast = 0;
         while(slow != fast){
             if(slow == nums[slow])
                 return slow;
             slow = nums[slow];
             fast = nums[fast];
         }
         return slow;
     }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[] {1,2,3,3,5,6,4};
		
	
		
		System.out.print(findDuplicate(a));

	}
}


