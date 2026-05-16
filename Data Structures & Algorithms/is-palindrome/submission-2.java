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
            if(s.toLowerCase().charAt(l)!=s.toLowerCase().charAt(r)){
                return false;
            }
           
            r--;
            l++;

        }
        return true;
    














        // int left = 0;
        // int right = s.length()-1;
        // s.toLowerCase();
        // while(left<right){
        //     while(left<right && !alphaNum(s.charAt(left))){
        //         left++;
        //     }
        //     while(right> left && !alphaNum(s.charAt(right))){
        //         right--;
        //     }
        //     if(s.toLowerCase().charAt(left)!=s.toLowerCase().charAt(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;
        
        // StringBuilder newStr = new StringBuilder();
        // for(char c : s.toCharArray()){
        //     if(Character.isLetterOrDigit(c)){
        //         newStr.append(Character.toLowerCase(c));
        //     }
        // }
        // return newStr.toString().equals(newStr.reverse().toString());

    // }
    // public boolean alphaNum(char c){
    //         return ((c >= 'a' && c<='z') || (c >='A' && c <='Z') || (c>='0' && c<='9'));
    // }
    }


    public boolean isAlphaNumeric(char c){
        return ((c>='a' && c<='z') ||  (c>='A' && c<='Z') || (c>='0' && c<='9'));
    }
}
