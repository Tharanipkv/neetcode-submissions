class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r= s.length()-1;
        while(l<r){
            while(l<r && !isAlphaNumeric(s.charAt(l))){
                l++;
            }
            while(r>l && !isAlphaNumeric(s.charAt(r))){
                r--;
            }
            if(s.toLowerCase().charAt(l)!=s.toLowerCase().charAt(r)){
                return false;
            }
            r--;
            l++;
        } 
        return true;       
    }
    public boolean isAlphaNumeric(char c){
        return ((c>='a' && c<='z') ||(c>='A' && c<='Z')  || (c>='0' && c<='9'));
    }
}
