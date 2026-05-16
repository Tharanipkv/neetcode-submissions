class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        // int[] prefix = new int[n];
        // int[] suffix = new int[n];
        // int[] res = new int[n];
        // prefix[0]=1;
        // suffix[n-1]=1;
        // for(int i=1;i<n;i++){
        //     prefix[i] = prefix[i-1] *nums[i-1];
        // }
        // for(int i=n-2;i>=0;i--){
        //     suffix[i] = suffix[i+1] *nums[i+1];
        // }
        // for(int i=0;i<n;i++){
        //     res[i] = prefix[i]*suffix[i];
        // }

        int res[] = new int[n];
        res[0] = 1;
        for(int i=1;i<n;i++){
            res[i] = res[i-1] * nums[i-1];
        }
        int postfix =1;
        for(int i=n-1;i>=0;i--){
            res[i] = res[i] * postfix;
            postfix = postfix* nums[i];
        }
        return res;
        
    }
}  
