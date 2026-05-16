class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int l=0;
        int r=height.length-1;
        int leftMax = height[l];
        int rightMax = height[r];
        int res=0;
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res+=  leftMax-height[l];
            }
            else{
                r--;
                rightMax =Math.max(rightMax, height[r]);
                res+= rightMax- height[r];
            }
        }
        return res;
        // int leftMax[] = new int[n];
        // int rightMax[] = new int[n];
        // leftMax[0] = height[0];
        // rightMax[n-1] = height[n-1];
        // for(int i=1;i<n;i++){
        //     leftMax[i] = Math.max(leftMax[i-1], height[i]);
        // }
        // for(int i=n-2;i>=0;i--){
        //     rightMax[i] = Math.max(rightMax[i+1], height[i]);
        // }
        // int res=0;
        // for(int i=0;i<n;i++){
        //     res+= Math.min(leftMax[i], rightMax[i]) - height[i];
        // }
        // return res;
        
    }
}
