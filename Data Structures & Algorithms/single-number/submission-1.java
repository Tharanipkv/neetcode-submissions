class Solution {
    public int singleNumber(int[] nums) {

        int res = 0;
        for(int i =0 ;i <nums.length;i++){
            boolean flag = false;
            for(int j = 0 ; j<nums.length; j++){
                if(i!=j && nums[i]==nums[j]){
                    flag = true;
                    break;
                }  
            }
            if(!flag){
                res = nums[i];
                break;
            }
        }
        return res;

        // int res=0;
        // for(int n: nums){
        //     res ^= n;
        // }
        // return res;
    }
}
