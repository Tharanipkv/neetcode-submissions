class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int n1=s.length();
        int count[] = new int[26];
        for(int i=0;i<n1;i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int n : count){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
