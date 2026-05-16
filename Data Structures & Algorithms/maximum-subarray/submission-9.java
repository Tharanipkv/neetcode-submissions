class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxS=nums[0];
        for(int n: nums){
            if(currSum<0){
                currSum=0;
            }
            currSum+=n;
            maxS = Math.max(currSum, maxS);
        }
        return maxS;
    }
}
