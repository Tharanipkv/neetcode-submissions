class Solution {
    public int characterReplacement(String s, int k) {
        int res =0;
        int l=0;
        int maxF=0;
        Map<Character, Integer> collect = new HashMap<>();
        for(int r=0;r<s.length();r++){
            collect.put(s.charAt(r), collect.getOrDefault(s.charAt(r),0)+1);
            maxF =Math.max(maxF, collect.get(s.charAt(r)));
            while((r-l+1)- maxF> k ){
                collect.put(s.charAt(l), collect.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;
        
    }
}
