class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";
        Map<Character, Integer> sCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();
        for(int i=0;i<t.length();i++){
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i),0)+1);
        }
        int have = tCount.size();
        int need =0;
        int resLen = Integer.MAX_VALUE;
        int res[] = {-1, -1};
        int l=0;
        int r=0;
        while(r<s.length()){
            char c = s.charAt(r);
            sCount.put(c, sCount.getOrDefault(c,0)+1);
            if(tCount.containsKey(c) && sCount.get(c).equals(tCount.get(c))){
                need++;
            }
            while(have==need){
                if((r-l+1)<resLen){
                    resLen = r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                c = s.charAt(l);
                sCount.put(c, sCount.get(c)-1);
                if(tCount.containsKey(c) && sCount.get(c)<tCount.get(c)){
                    need--;
                }
                l++;
            }
            
            r++;

        }
        return resLen==Integer.MAX_VALUE ? "": s.substring(res[0], res[1]+1);
        
    }
}
