class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> collectSet = new HashSet<>();
        for(int n: nums){
            if(collectSet.contains(n)){
                return true;
            }
            collectSet.add(n);
        }
        return false;

        // Arrays.sort(nums)
        // for(int i=0;i<nums.length;i++){

        // }
        
    }
}