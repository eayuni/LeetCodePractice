package pkg1;

//1281. Subtract the Product and Sum of Digits of an Integer

public class SubtractProductSumDigits {
	
	 public static int subtractProductAndSum(int n) {
	        int sum=0;
	        int product=1;
	        
	        while (n > 0) {
	         int remainder  =(n % 10);
	        n = n / 10;
	        
	       
	        sum+=remainder;
	        product*=remainder;
	        
	}
	        
	        
	    return product-sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subtractProductAndSum(234));
	}

}
