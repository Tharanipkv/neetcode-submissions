class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0]= 1;
        suffix[n-1]=1;
        for(int i=1;i<n;i++){
            prefix[i] = nums[i-1] * prefix[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            res[i] = prefix[i] * suffix[i];
        }
        return res;


        // int res[] = new int[n];
        // res[0] = 1;
        // for(int i=1.;i<n;i++){
        //     res[i] = nums[i-1] * res[i-1];
        //     postfix = posfix*nums[i];
        // }
        // int prefix[] = new int[n];
        // int postfix[] = new int[n];
        // prefix[0]=1;
        // postfix[n-1]=1;
        // for(int i=1;i<n;i++){
        //     prefix[i] = prefix[i-1] * nums[i-1];
        // }
        // for(int i= n-2;i>=0;i--){
        //     postfix[i] = postfix[i+1]*nums[i+1];
        // }
        // int res[] = new int[n];
        // for(int i=0;i<n;i++){
        //     res[i] = prefix[i]*postfix[i];
        // }
        // return res;

        
    }
}  
