class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int res=0;
        Map<Character, Integer> map = new HashMap<>();
        int maxF=0;
        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
            maxF = Math.max(map.get(s.charAt(r)), maxF);
            while((r-l+1)-maxF > k){
                 map.put(s.charAt(l), map.get(s.charAt(l))-1);
                 l++;
            }
            res= Math.max(r-l+1, res);
        }
        return res;
        
    }
}
