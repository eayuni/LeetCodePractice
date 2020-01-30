package hiredintech;

public class PalindromicNumber {
	public static boolean is_numeric_palindrome(long number) {
	      int reverseN =0;
	      int n = (int) number;
	      
	      while(number >0){
	          int r =(int) number%10;
	          reverseN = reverseN*10 + r;
	          number = number/10;
	          
	      }
	      System.out.println(n);
	      System.out.println(number);
	      System.out.println(reverseN);
	      
	      if(n == reverseN) {
	    	  return true;
	      }
	      else
	     return false;
	    // Write your code here
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 999;
	       System.out.println(is_numeric_palindrome(n));
	}

}
