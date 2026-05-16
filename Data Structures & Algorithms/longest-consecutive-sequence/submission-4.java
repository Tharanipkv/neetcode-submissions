class Solution {
    public int longestConsecutive(int[] nums) {

       List<Integer> list = new ArrayList<>();
       for(int n1: nums ){
        list.add(n1);
       }
       int longest=0;
       for(int n: nums){
        if(!list.contains(n-1)){
            int length=1;
            while(list.contains(n+length)){
                length++;
            }
            longest = Math.max(longest, length);
        }
       }
       return longest;
        
    }
}
