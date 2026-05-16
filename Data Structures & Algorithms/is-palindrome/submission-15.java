class Solution {
    public boolean isPalindrome(String s) {

        int l=0;
        int r=s.length()-1;
        
        while(l<r){
            while(l<r && !isAlphaNum(s.charAt(l))){
                l++;
            }
             while(l<r && !isAlphaNum(s.charAt(r))){
                r--;
            }
            if(!(s.toLowerCase().charAt(l) == s.toLowerCase().charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isAlphaNum(char c){
        return ((c>='0' && c<='9') ||(c>='a' && c<='z')  || (c>='A' && c<='Z'));
    }
}
