class Solution {
    public int[] productExceptSelf(int[] nums) {
         // 1 2 4 6
         // 1 1 2 8
         // 48 24  6 1
        int n = nums.length;
        int[] res = new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]= res[i-1] * nums[i-1];
        }
        int postfix =1;
        for(int i=n-1;i>=0;i--){
            res[i]= res[i]*postfix;
            postfix =postfix* nums[i];
        }
        return res;
        // int[] prefix = new int[n];
        // int[] postfix = new int[n];
        // prefix[0]=1;
        // for(int i=1;i<n;i++){
        //     prefix[i] = prefix[i-1] * nums[i-1];
        // }
        // postfix[n-1]=1;
        // for(int i=n-2;i>=0;i--){
        //     postfix[i] = postfix[i+1] * nums[i+1];
        // }
        // int[] res = new int[n];
        // for(int i=0;i<n;i++){
        //     res[i] = prefix[i] * postfix[i];
        // }
        // return res;
    }
}  
