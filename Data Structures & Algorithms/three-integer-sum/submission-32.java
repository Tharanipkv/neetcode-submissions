class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //it is similar to two sum use pointers
        //for loop for 1st
        //duplicates to be restricted
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break; 
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int target = nums[i]+nums[l]+nums[r];
                if(target>0){
                    r--;
                }
                else if(target<0){
                    l++;
                }
                else{
                    list.add(Arrays.asList( nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return list;
    }
}
