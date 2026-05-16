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

       // return Arrays.stream(nums).distinct().count()<nums.length;

       for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return true;
            }
        }
       }
       return false;
    }
}