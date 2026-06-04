class Solution {
    public boolean hasDuplicate(int[] nums) {
       // return Arrays.stream(nums).distinct().count()<nums.length;

    //     Set<Integer> set = new HashSet<>();
    //    for(int n:nums){
    //     if(set.contains(n)){
    //         return true;
    //     }
    //     set.add(n);
    //    }
    //     return false;
        Arrays.sort(nums);
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]==nums[i]){
                return true;
            }
            j++;
        }
        return false;
    }
   
}