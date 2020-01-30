package pkg1;
//343. Integer Break

public class IntegerBreak {
	  public static int integerBreak(int n) {
		  int product =1;
		
		  while(n%3 == 0) {
			  product *= n/3;
			  n = n -n/3;
		  }
		  
		  while(n%2 == 0) {
			  product *= n/2;
			  n = n -n/2; 
		  }
		
		return product;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		System.out.print(integerBreak(n));
	}

}
