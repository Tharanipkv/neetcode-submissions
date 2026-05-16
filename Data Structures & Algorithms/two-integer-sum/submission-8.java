class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> collect = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(collect.containsKey(diff)){
                return new int[]{collect.get(diff), i};
            }
            collect.put(nums[i], i);

        }
        return new int[]{};
        

        //int n = nums.length;
        // Map<Integer, Integer> collect = new HashMap<>();
        // for(int i=0; i< nums.length; i++){
        //     int diff = target -nums[i];
        //     if(collect.containsKey(diff)){
        //         return new int[]{collect.get(diff), i};
        //     }
        //     collect.put(nums[i], i);
        // }
        // return new int[]{};
        //  int[] n =new int[2];
        // for(int i =0; i<(nums.length-1);i++){
        //     for(int j=i+1; j< nums.length;j++){
        //         if(nums[i]+nums[j] == target){
        //             n[0]= i;
        //             n[1]=j;
        //         }
        //     }
        // }
        //  return n;

        // Map<Integer, Integer> collect = new HashMap<>();
        // for(int i =0; i<nums.length; i++){
        //     int diff = target - nums[i];
        //     if(collect.containsKey(diff)){
        //         return new int[]{collect.get(diff), i};
        //     }
        //     collect.put(nums[i], i);
        // }
        // return new int[]{};
        
    }
}
