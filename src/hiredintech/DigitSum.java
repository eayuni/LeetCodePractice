package hiredintech;

public class DigitSum {
	public static int digit_sum(long number) {
		
		 int sum = 0;
		  if (number < 0) {
		    number *= -1;
		  }

		  while (number > 0) {
		    sum += (int)number % 10;
		    number /= 10;
		  }

		  return sum;
		
	      // Write your code here
	      
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       long n = 1325132435;
       System.out.println(digit_sum(n));
	}

}
