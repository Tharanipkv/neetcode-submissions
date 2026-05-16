class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> collect = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!collect.add(nums[i])){
        //         return true;
        //     }
        // }
        // return false;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}