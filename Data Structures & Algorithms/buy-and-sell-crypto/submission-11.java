class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int l=0;
        int r=1;
        int maxP=0;
        while(r<n){
            if(prices[r]>prices[l]){
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            }
            else{
                l=r;
            }
            r++;
        }
        return maxP;

        
    }
}
