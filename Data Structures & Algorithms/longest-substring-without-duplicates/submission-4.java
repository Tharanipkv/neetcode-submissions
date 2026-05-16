class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> collect = new HashSet<>();
        int l=0;
        int res = 0;
        for(int r=0;r<s.length();r++){
            while(collect.contains(s.charAt(r))){
                collect.remove(s.charAt(l));
                l++;
            }
            collect.add(s.charAt(r));
            res = Math.max(res, r-l+1);

        }
        
        return res;
    }
}
