class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int m = l+(r-l)/2;
            if(nums[m]<nums[r]){
                 r=m;
            }
            else{
               l=m+1;
            }
        }
        return nums[l];

        // [3,4,5,6,7,8,9,1,2,3]
        // 8-0/2 = 5;
        // nums[m]=9; 9>3 l=m+1;



        
    }
}
