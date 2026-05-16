class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if(sLength!=tLength){
            return false;
        } 
        // int count[] = new int[26];
        // for(int i=0;i<sLength;i++){
        //     count[s.charAt(i)-'a']++;
        //     count[t.charAt(i)-'a']--;
        // }
        // for(int n: count){
        //     if(n!=0){
        //         return false;
        //     }
        // }
        // return true;

        Map<Character, Integer> sCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();
        
       
        for(int i=0;i<sLength;i++){
            int val = 0;
            int val1 = 0;
            if(sCount.containsKey(s.charAt(i))){
                val = sCount.get(s.charAt(i));
            }
            if(tCount.containsKey(t.charAt(i))){
                val1 = tCount.get(t.charAt(i));
            }
            sCount.put(s.charAt(i), val+1);
            tCount.put(t.charAt(i), val1+1);
        }
        return sCount.equals(tCount);

    }
}
