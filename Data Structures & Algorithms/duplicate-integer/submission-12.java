class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> collect = new HashSet<>();
        // for(int n: nums){
        //     if(collect.contains(n)){
        //         return true;
        //     }
        //     collect.add(n);
        // }
        // return false;

        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                return true;
            }
        }
        return false;
    }
}