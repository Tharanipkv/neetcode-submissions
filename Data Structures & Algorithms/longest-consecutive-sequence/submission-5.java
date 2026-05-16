class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> collect = new HashSet<>();
        for(int n: nums){
            collect.add(n);
        }
        int longest =0;
        for(int n:nums){
            if(!collect.contains(n-1)){
                int length=1;
                while(collect.contains(n+length)){
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }    
        return longest;  
    }
}
