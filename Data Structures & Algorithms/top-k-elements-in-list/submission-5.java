class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> collect = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            collect.put(nums[i], collect.getOrDefault(nums[i],0)+1);
        }        
        List<Integer>[] list = new List[nums.length+1];
        for(int i=0;i<list.length;i++){
            list[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : collect.entrySet()){
            list[entry.getValue()].add(entry.getKey());
        }
        int index=0;
        int[] res = new int[k];
        for(int i=list.length-1;i>=0 && index<k;i--){
            for(int n : list[i]){
                res[index] = n;
                index++;
                if(index==k){
                    return res;
                }
            }
        }
        return res;
    }
}
