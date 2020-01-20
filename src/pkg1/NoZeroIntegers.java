package pkg1;

import java.util.Arrays;

public class NoZeroIntegers {
	
	//1317. Convert Integer to the Sum of Two No-Zero Integers
    public static int[] getNoZeroIntegers(int n) {
    	
    	if(n<2) {
    		return null;
    	}
        
        int A= 1;
        int B= n-A;
         
        
        while(String.valueOf(B).contains("0") || String.valueOf(A).contains("0") ){
            A = A+1;
            B= B-1;
            
        }
        
        int [] result = new int []{A,B};
         

        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(getNoZeroIntegers(10)));
		System.out.println(Arrays.toString(getNoZeroIntegers(1010)));
		System.out.println(Arrays.toString(getNoZeroIntegers(2)));
		System.out.println(Arrays.toString(getNoZeroIntegers(69)));
		System.out.println(Arrays.toString(getNoZeroIntegers(1)));

	}

}
