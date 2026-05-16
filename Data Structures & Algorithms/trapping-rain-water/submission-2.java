class Solution {
    public int trap(int[] height) {
        // int l =0;
        // int r =height.length - 1;
        // int leftMax = height[l];
        // int rightMax =  height[r];
        // int result = 0;
        // (while(l<r){
        //     if(leftMax< rightMax){
        //         l++;
        //         leftMax = Math.max(leftMax, height[l]);
        //         result += leftMax - height[l];                
        //     }
        //     else{
        //         r--;
        //         rightMax = Math.max(rightMax, height[r]);
        //         result += rightMax - height[r];
        //     }
        // }
        // return result;
        // int n = height.length;
        // int[] maxLeft = new int[n];
        // int[] maxRight = new int[n];
        // maxLeft[0] = height[0];
        // for(int i=1; i<n;i++){
        //     maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
        // }
        // maxRight[n-1] = height[n-1];
        // for(int i=n-2; i>=0;i--){
        //     maxRight[i] =Math.max(maxRight[i+1], height[i]);
        // }
        // int res=0;
        // for(int i=0;i<n;i++){
        //     res+= Math.min(maxLeft[i], maxRight[i]) - height[i];
        // }
        
        // return res;
        // int n = height.length;
        // int l=0;
        // int r=n-1;
        // int leftMax = l;
        // int rightMax = r;
        // int res=0;
        // while(l<r){
        //     if(leftMax>rightMax){
        //         r--;
        //         rightMax = Ma qth.max()
        //         res += Math.

        //     }
        // }
        int n = height.length;
        int[] maxRight = new int[n];
        int[] maxLeft = new int[n];
        maxLeft[0] = height[0];
        for(int i =1;i<n;i++){
            maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
        }
        maxRight[n-1]= height[n-1];
        for(int i=n-2; i>=0;i--){
            maxRight[i] = Math.max(maxRight[i+1], height[i]);
        }
        int res=0;
        for(int i=n-2; i>=0;i--){
            res+= Math.min(maxRight[i], maxLeft[i]) - height[i];
        }
        return res;
    }
}
