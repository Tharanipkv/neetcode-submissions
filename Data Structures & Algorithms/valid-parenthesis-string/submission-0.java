class Solution {
    public boolean checkValidString(String s) {
        int leftMin=0;
        int leftMax=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                leftMax+=1;
                leftMin+=1; 
            }
            else if(c==')'){
                leftMax-= 1;
                leftMin-= 1;
            }
            else{
                leftMax+=1;
                leftMin-=1;
            }
            if(leftMax<0){
                return false;
            }
            if(leftMin<0){
                leftMin=0;
            }
        }
        return leftMin==0;
    }
}
