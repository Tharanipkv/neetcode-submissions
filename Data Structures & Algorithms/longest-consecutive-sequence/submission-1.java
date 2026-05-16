class Solution {
    public int longestConsecutive(int[] nums) {
        // Set<Integer> numSet = new HashSet<>();
        // for(int num: nums){
        //     numSet.add(num);
        // }
        // int longest=0;
        // for(int n: numSet){
        //     if(!numSet.contains(n-1)){
        //         int length =1;
        //         while(numSet.contains(n+length)){
        //             length++;
        //         }
        //         longest = Math.max(longest, length);
        //     }
        // }
        // return longest;

        Set<Integer> collect = new HashSet<>();
        for(int n : nums){
            collect.add(n);
        }
        int longest=0;
        for(int n : collect){
            if(!collect.contains(n-1)){
                int length =1;
                while(collect.contains(n+length)){
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
        
    }
}
