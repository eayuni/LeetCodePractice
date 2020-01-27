package pkg1;



//33. Search in Rotated Sorted Array
public class SearchRotatedSortedArray {
	public static int search(int[] nums, int target) {
	      int i;
	      
        for(i=0; i<nums.length; i++){
        	
           if(nums[i] == target)
           {
        	  return i;
           }
           
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int []a =new int[] {1,2,3,4,5,6,7};
		int []a =new int[] {4,5,6,7,0,1,2};
		
		int n=7;
		
		System.out.print(search(a,n));

	}

}
