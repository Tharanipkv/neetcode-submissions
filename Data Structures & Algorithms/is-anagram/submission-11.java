class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if(sLength!=tLength){
            return false;
        } 
        int count[] = new int[26];
        for(int i=0;i<sLength;i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int n: count){
            if(n!=0){
                return false;
            }
        }
        return true;

    }
}
