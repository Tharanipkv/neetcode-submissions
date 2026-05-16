class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int longest =0;
        for(int n: nums){
            list.add(n);
        }
        for(int n: nums){
            if(!list.contains(n-1)){
                int length =1;
                while(list.contains(n+length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
       
    }
}
