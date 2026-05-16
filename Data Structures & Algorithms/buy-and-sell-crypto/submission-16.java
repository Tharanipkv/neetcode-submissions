class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int n=prices.length;
        int r=1;
        int maxA=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int profit = prices[r]-prices[l];
                maxA = Math.max(maxA, profit);
            }
            else{
                l=r;
            }
            r++;
        }
        return maxA;
    }
}
