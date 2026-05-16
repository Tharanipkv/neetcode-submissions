class Solution {
    public int maxSubArray(int[] nums) {
        int maxA = nums[0];
        int curr =0;
        for(int n: nums){
            if(curr<0){
                curr=0;
            }
            curr+= n;
            maxA = Math.max(maxA, curr);

        }
        return maxA;
    }
}
