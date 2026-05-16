class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> collectSet = new HashSet<>();
        // for(int n: nums){
        //     if(collectSet.contains(n)){
        //         return true;
        //     }
        //     collectSet.add(n);
        // }
        // return false;

        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;

        return Arrays.stream(nums).distinct().count()<nums.length;
        
    }
}