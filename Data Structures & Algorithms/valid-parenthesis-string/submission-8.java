class Solution {
    public boolean checkValidString(String s) {
        //two varaibles //two responsibility
        //varaibles behave same way when it is close or open brackets
        //when * comes leftMax means by considering open bracket for *
        //leftMin means by considering close bracket for *

        int leftMin=0;
        int leftMax=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                leftMax++;
                leftMin++;
            }
            else if(c==')'){
                leftMin--;
                leftMax--;
            }
            else{
                leftMax++;
                leftMin--;
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
