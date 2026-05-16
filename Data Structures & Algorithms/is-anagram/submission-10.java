class Solution {
    public boolean isAnagram(String s, String t) {
        // Map<Character, Integer> sCount = new HashMap<>();
        // Map<Character, Integer> tCount = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        int[] res = new int[26];
        for(int i=0;i<s.length();i++){
            res[s.charAt(i)-'a']++;
            res[t.charAt(i)-'a']--;
        }
        for(int n: res){
            if(n!=0){
                return false;
            }
        }
        return true;
        // for(int i=0;i<s.length();i++){
        //     sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i),0)+1);
        //     tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i),0)+1);
        // }
        // return sCount.equals(tCount);
    }

}
