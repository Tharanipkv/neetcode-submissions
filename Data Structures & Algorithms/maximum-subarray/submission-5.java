class Solution {
    public int maxSubArray(int[] nums) {
       
        int maxA = nums[0];
        int currSum=0;
        for(int n : nums){
            
            if(currSum<0){
                currSum=0;
            }
            currSum+=n;
            maxA = Math.max(currSum, maxA);

        }
        return maxA;
        
    }
}
