class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(set.contains(nums[i])){
        //         return true;
        //     }
        //     set.add(nums[i]);
        // }        
        // return false;

        return Arrays.stream(nums).distinct().count()<nums.length;
    }
}