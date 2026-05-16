class Solution {
    public boolean hasDuplicate(int[] nums) {
    //  Set<Integer> collect = new HashSet<>();
    //  for(int i=0;i<nums.length;i++){
    //     if(collect.contains(nums[i])){
    //         return true;
    //     }
    //     collect.add(nums[i]);
    //  }
    //   return false;

    return Arrays.stream(nums).distinct().count()<nums.length;
    }   
}