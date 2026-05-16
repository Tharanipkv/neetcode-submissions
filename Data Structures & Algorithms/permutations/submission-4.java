class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        backtrack(nums, 0);
        return res;
    }
    public void backtrack(int[] nums, int idx){
        if(idx==nums.length){
            List<Integer> perm = new ArrayList<>();
            for(int num:nums){
                perm.add(num);
            }
            res.add(perm);
        }
        for(int j=idx ;j<nums.length;j++){
            swap(nums, idx, j);
            backtrack(nums, idx+1);
            swap(nums, idx, j);
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
