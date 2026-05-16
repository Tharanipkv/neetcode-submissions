class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int max=nums[0];
        for(int num : nums){
            if(curr<0){
                curr=0;
            }
            curr+=num;
            
            max= Math.max(curr, max);
        }
        return max;
        
    }
}
