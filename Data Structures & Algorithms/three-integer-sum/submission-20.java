class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> collect = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return collect;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=n-1;
            while(l<r){
                int res =nums[i]+nums[l]+nums[r];
                if(res<0){
                    l++;
                }
                else if(res>0){
                    r--;
                }
                else{
                    collect.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    r--;
                    l++;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                }

            }
        }
        return collect;

        
    }
}
