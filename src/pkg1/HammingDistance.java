package pkg1;

public class HammingDistance {
	
	public static int hammingDistance(int x, int y) {
	      int number = x ^ y;
	      
	        int countOfSetBits = 0;
	        while (number != 0) {
	            countOfSetBits += number & 1;
	            System.out.println("000"+countOfSetBits);
	            number = number >> 1;
	            System.out.println("..."+number);
	        }
	        return countOfSetBits;  
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingDistance(1,4));
	}

}
