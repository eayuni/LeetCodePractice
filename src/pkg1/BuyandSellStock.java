package pkg1;

//121. Best Time to Buy and Sell Stock

public class BuyandSellStock {
	public static int maxProfit(int[] prices) {
        int maxBuy = Integer.MAX_VALUE;
        int minSell = 0;
        
        if(prices.length == 0) {
        	return 0;
        }
        
       for(int i=0; i<prices.length; i++) {
    	   System.out.println("iteration:  "+i);
    	   System.out.println(minSell);
       	System.out.println(maxBuy);
       	
        	minSell= Math.max(minSell, (prices[i]-maxBuy));
        	
        	maxBuy = Math.min(maxBuy, prices[i]);
        	
        	System.out.println("");
        	System.out.println(minSell);
        	System.out.println(maxBuy);
        }
		return minSell;
		
		
	      
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int []a =new int[] {7,1,5,3,6,4};
		
		System.out.println(maxProfit(a));

	}

}
