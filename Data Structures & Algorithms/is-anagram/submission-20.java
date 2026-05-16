class Solution {
    public boolean isAnagram(String s, String t) {
        int slength= s.length();
        int tlength= t.length();
        if(slength!=tlength){
            return false;
        }
        // int count[] =  new int[26];
        // for(int i=0;i<slength;i++){
        //     count[s.charAt(i)-'a']++;
        //     count[t.charAt(i)-'a']--;
        // }

        // for(int i=0;i<26;i++){
        //     if(count[i]!=0){
        //         return false;
        //     }
        // }
        // return true;

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();
        for(int i=0;i<slength;i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i),0)+1);
             countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i),0)+1);
        }
        return countS.equals(countT);
        


    }
}
