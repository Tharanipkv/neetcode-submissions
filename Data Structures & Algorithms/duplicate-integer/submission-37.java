class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int n: nums){
        //     if(set.contains(n)){
        //         return true;
        //     }
        //     set.add(n);
        // }
        // return false;

        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i-1]==nums[i]){
        //         return true;
        //     }
        // }
        // return false;

        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}