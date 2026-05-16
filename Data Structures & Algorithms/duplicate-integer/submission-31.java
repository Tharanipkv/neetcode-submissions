class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> collect = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!collect.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}