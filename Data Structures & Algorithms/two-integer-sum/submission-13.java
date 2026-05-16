class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> collect = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(collect.containsKey(diff)){
                return new int[]{collect.get(diff), i};
            }
            collect.put(nums[i], i);
        }        
        return new int[]{};
    }
}
