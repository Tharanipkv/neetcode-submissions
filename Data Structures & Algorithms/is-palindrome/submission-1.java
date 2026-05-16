class Solution {
    public boolean isPalindrome(String s) {
       
       int left = 0;
       int right = s.length()-1;
       while(left<right){
            while(left<right && !alphaNum(s.charAt(left))){
                left++;
            }
            while(right> left && !alphaNum(s.charAt(right))){
                right--;
            }
            if((s.toLowerCase().charAt(left))!=(s.toLowerCase().charAt(right))){
                return false;
            }
            left++;
            right--;
       }
       
       return true;

    }

    public boolean alphaNum(char c){
        if((c>='a' && c<='z') ||(c>='A' && c<='Z') || (c>='0' && c<='9')){
            return true;
        }
        return false;
    }













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
