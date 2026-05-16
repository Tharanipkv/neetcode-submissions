class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length() || t.length()==0 || s.length()==0 || s.length()==0){
            return "";
        }
        Map<Character, Integer> tCount = new HashMap<>();
        Map<Character, Integer> wCount= new HashMap<>();
        for(char c : t.toCharArray()){
            tCount.put(c, tCount.getOrDefault(c,0)+1);
        }
        int have=0;
        int need=tCount.size();
        int l=0;
        int res[] = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            wCount.put(c, wCount.getOrDefault(c, 0)+1);
            if(tCount.containsKey(c) && wCount.get(c)==tCount.get(c)){
                have++;
            }
            while(have==need){
                if(resLen>r-l+1){
                    resLen = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }
                c = s.charAt(l);
                wCount.put(c, wCount.get(c)-1);
                if(tCount.containsKey(c) && wCount.get(c)<tCount.get(c)){
                    have--;
                }
                l++;
            }
        }

        return resLen==Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);

        
    }
}
