class Solution {
    public boolean isPalindrome(String s) {
        
        int r=s.length()-1;
        int l=0;
        while(r>l){
            while(r>l && !isAlphaNumeric(s.charAt(r))){
                r--;
            }
            while(r>l && !isAlphaNumeric(s.charAt(l))){
                l++;
            }
            if(Character.toLowerCase(s.charAt(r))!=Character.toLowerCase(s.charAt(l))){
                return false;
            }
            r--;
            l++;

        }
        return true;
    }

        public boolean isAlphaNumeric(char c){
            return (c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9');
        }
}
