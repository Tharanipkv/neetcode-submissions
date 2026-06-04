class Solution {
    public boolean hasDuplicate(int[] nums) {
       // return Arrays.stream(nums).distinct().count()<nums.length;

        Set<Integer> set = new HashSet<>();
       for(int n:nums){
        if(set.contains(n)){
            return true;
        }
        set.add(n);
       }
        return false;
    }
   
}