class Solution {
    public int maxProfit(int[] prices) {
        int maxP =0;
        int l=0;
        int r=1;
        while(r<prices.length){
            if(prices[r]>prices[l]){
                int p = prices[r]- prices[l];
                maxP = Math.max(maxP, p);
            }
            else{
                l=r;
            }
            r++;
        }
        return maxP;
        
    }
}
