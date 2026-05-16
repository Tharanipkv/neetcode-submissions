class Solution {
    public int characterReplacement(String s, int k) {

        Map<Character, Integer> collect = new HashMap<>();
        int l=0;
        int maxF=0;
        int res=0;
        for(int r=0;r<s.length();r++){
            collect.put(s.charAt(r), collect.getOrDefault(s.charAt(r),0)+1);
            maxF = Math.max(maxF, collect.get(s.charAt(r)));
            while(((r-l+1) - maxF) > k){
                collect.put(s.charAt(l), collect.get(s.charAt(l))-1);
                l++;
            } 
            res =Math.max(r-l+1, maxF);
        }
        return res;
        
    }
}
