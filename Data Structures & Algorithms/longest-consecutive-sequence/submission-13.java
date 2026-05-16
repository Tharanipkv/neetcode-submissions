class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int i=0;
        int longest=0;
        while(i<nums.length){
             int length=1;
            while(set.contains(nums[i]+length)){
                length++;
            }
            longest = Math.max(length, longest);
            i++;
        }
        return longest;
        
    }
}
