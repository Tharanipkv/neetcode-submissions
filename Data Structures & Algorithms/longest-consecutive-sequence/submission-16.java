class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int n:nums){
            list.add(n);
        }
        int longest=0;
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i]-1)){
                int length=1;
                while(list.contains(nums[i]+length)){
                    length++;
                }
                longest = Math.max(length, longest);

            }
        }
        return longest;
    }
}
