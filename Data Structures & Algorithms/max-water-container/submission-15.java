class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxA=0;
        while(l<r){
            int area = Math.min(heights[l], heights[r]) * (r-l);
            maxA = Math.max(area, maxA);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxA;
        
    }
}
