class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        Set<Character> set = new HashSet<>();
        int length=0;
        while(r<s.length()){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            length = Math.max(length, r-l+1);
            r++;
        }
        return length;
        
    }
}
