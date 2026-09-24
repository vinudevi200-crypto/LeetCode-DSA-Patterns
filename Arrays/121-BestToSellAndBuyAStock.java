class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }

            int newprofit=prices[i]-min;

            if(newprofit>profit){
                profit=newprofit;
            }
        }

        return profit;   
    }
}
