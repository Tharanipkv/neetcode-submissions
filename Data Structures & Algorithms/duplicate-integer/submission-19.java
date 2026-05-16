class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> collect = new HashSet<>();
        // for(int n: nums){
        //     if(!collect.add(n)){
        //         return true;
        //     }
        //     collect.add(n);
        // }
        // return false;
        return Arrays.stream(nums).distinct().count()<nums.length;
    }   
}