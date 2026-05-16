class Solution {
    public String minWindow(String s, String t) {
        int resLen = Integer.MAX_VALUE;
        int res[] = {-1,-1};
        int l=0;
        Map<Character, Integer> tCount = new HashMap<>();
        Map<Character, Integer> sCount = new HashMap<>();
        for(char c : t.toCharArray()){
            tCount.put(c, tCount.getOrDefault(c,0)+1);
        }
        int have=0;
        int need =tCount.size();
        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            sCount.put(c,sCount.getOrDefault(c,0)+1);
            if(tCount.containsKey(c) && tCount.get(c)==sCount.get(c)){
                have++;
            }
            while(have==need){
                if(r-l+1 < resLen){
                    resLen = r-l+1;
                    res[0] =l;
                    res[1] =r;
                }
                c = s.charAt(l);
                sCount.put(c, sCount.get(c)-1);
                if(tCount.containsKey(c) && sCount.get(c)<tCount.get(c)){
                    have--;
                }
            l++;
            }
        }
        return resLen==Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);
    }
}
