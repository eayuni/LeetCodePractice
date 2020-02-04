package pkg1;

public class UglyNumber {
	
	public static boolean isUgly(int num) {
	        
	      
	       while(num > 0) {
	    	   
	    	   if(num%2 == 0) {
	    		   num=num/2;
	    	   }
	    	   else if(num%3 == 0) {
	    		   num = num/3;
	    	   }
	    	   else if(num%5 == 0) {
	    		   num=num/5;
	    	   }
	       }
	        return num==1;
	           
	        }
	      


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUgly(6));
	}

}
