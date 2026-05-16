class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int maxf =0;
        int res = 0;
        Map<Character, Integer> collect = new HashMap<>();
        for(int r=0;r<s.length();r++){
            collect.put(s.charAt(r), collect.getOrDefault(s.charAt(r),0)+1);
            maxf = Math.max(maxf, collect.get(s.charAt(r)));
            while((r-l+1) - maxf >k){
                collect.put(s.charAt(l), collect.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res, r-l+1);

        }
        return res;
    }
}
