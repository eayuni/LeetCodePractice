package pkg1;



//91. Decode Ways
public class DecodeWays {

	public static int numDecodings(String s) {
		 int len = s.length();
	        
	        if(len == 0){
	            return 0;
	        }
	        
	        int [] dp = new int [len+1];
	        
	        dp[0] = 1;
	        dp[1] = s.charAt(0) != '0'? 1 :0;
	        
	        for(int i = 2 ; i<=len; i++){
	        
	        
	        	
	            int first = Integer.valueOf(s.substring(i-1, i));
	            int second = Integer.valueOf(s.substring(i-2, i));
	          
	            
	            if(first >= 1 && first <= 9){
	                dp[i] += dp[i-1];
	                
	            }
	           if(second >=10 && second <=26){
	                dp[i] +=dp[i-2];
	               
	            }
	       		
	        }
	        
	        return dp[len];
	    }
        
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "226";
		
		System.out.println(numDecodings(a));
	}

}
