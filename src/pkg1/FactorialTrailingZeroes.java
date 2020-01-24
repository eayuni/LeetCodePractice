package pkg1;



//172. Factorial Trailing Zeroes
public class FactorialTrailingZeroes {
	 public static int trailingZeroes(int n) {
		 int count =0;
		 
		 while(n>0) {
			 
			 count += n/5;
			 
			 n= n/5;
		
		 }
		return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		
		System.out.println(trailingZeroes(n));
	}

}
