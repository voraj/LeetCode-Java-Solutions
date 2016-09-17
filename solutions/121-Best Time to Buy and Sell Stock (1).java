public class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length==0)
            return 0;
        int profit=0;
        int buyPrice=prices[0];
        
        for(int i=1;i<prices.length;i++){
            profit=Math.max(profit, prices[i]- buyPrice);
            if(buyPrice>prices[i])
                buyPrice=prices[i];
        }
        return profit;
        
    }
}