package pkg1;

//1295. Find Numbers with Even Number of Digits
public class EvenNumberDigits {
	  public static int findNumbers(int[] nums) {
	        int size= nums.length;
	        int evenNumbers = 0;
	        
	        for(int i=0; i< size; i++){
	            int len= String.valueOf(nums[i]).length();
	            if(len % 2 == 0) {
	            	evenNumbers ++;
	            }
	            
	        }return evenNumbers;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int [] {555,901,482,1771};
		int [] nums1 = new int[] {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
		System.out.println(findNumbers(nums1));

	}

}
