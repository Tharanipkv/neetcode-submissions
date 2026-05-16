class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0){
            return "";
        }
        Map<Character, Integer> sCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();
        for(int i=0;i<t.length();i++){
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i),0)+1);
           // sCount.put(s.charAt(i), sCount.getOrDefault(t.charAT(i),0)+1);
        }
        int have =0;
        int need =tCount.size();
        int l=0;
        int r=0;
        int resLen = Integer.MAX_VALUE;
        int res[] = {-1, -1};
        while(r<s.length()){
            char c = s.charAt(r);
            sCount.put(c, sCount.getOrDefault(c,0)+1);
            if(tCount.containsKey(c) && tCount.get(c).equals(sCount.get(c))){
                have++;
            }
            while(have==need){
                if((r-l+1 )< resLen ){
                    resLen = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }
                c = s.charAt(l);
                sCount.put(c, sCount.get(c)-1);
                if(tCount.containsKey(c) && tCount.get(c)>(sCount.get(c))){
                     have--;
                }
                l++;                
            }
            r++;
        }
        return resLen == Integer.MAX_VALUE  ? "":  s.substring(res[0], res[1]+1); 
    }
}
