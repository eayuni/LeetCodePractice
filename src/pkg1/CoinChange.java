package pkg1;
//322. Coin Change

import java.util.Arrays;

public class CoinChange {
	 public static int coinChange(int[] coins, int amount) {
		 int max= amount +1;
	        
	        int dp[] = new int[max];
	        
	        Arrays.fill(dp,max);
	        
	        dp[0] = 0;
	        
	        for(int i= 1; i<= amount; i++){
	            
	            for(int j=0; j<=coins.length-1; j++){
	                
	                if(coins[j] <= i){
	                    
	                    dp[i] = Math.min(dp[i], dp[i- coins[j]]+1);
	                }
	            }
	        }
	        return dp[amount] > amount ? -1 : dp[amount];
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a =new int[] {1,2,5,};
		int n =11;
		
	
		
		System.out.print(coinChange(a,n));

	}

}
