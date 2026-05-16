class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int n: nums){
        //     if(!set.add(n)){
        //         return true;
        //     }
        //     set.add(n);
        // }
        // return false;

        return Arrays.stream(nums).distinct().count()<nums.length;
    }
}