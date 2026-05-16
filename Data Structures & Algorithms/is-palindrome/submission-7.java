class Solution {
    public boolean isPalindrome(String s) {
        
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(l<r && !isAlphaNumeric(s.charAt(l))){
                l++;
            }
            while(l<r && !isAlphaNumeric(s.charAt(r))){
                r--;
            }
            if(s.toLowerCase().charAt(r)!=s.toLowerCase().charAt(l)){
                return false;
            }
            l++;
            r--;
        }
        return true;        
    }
    public boolean isAlphaNumeric(char c){
        return ((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9') ); 
    }
}
