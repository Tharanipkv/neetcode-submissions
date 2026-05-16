class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int l=0;
        int r=0;
        while(r<prices.length){
            if(prices[r]>prices[l]){
                int profit = prices[r]- prices[l];
                maxP = Math.max(maxP, profit);
            }
            else{
                l =r;
            }
            r++;
        }
        return maxP;
        
    }
}
