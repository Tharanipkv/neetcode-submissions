class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        List<Integer>[] list = new List[n+1];
        for(int i=0;i<list.length;i++){
            list[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            list[entry.getValue()].add(entry.getKey());
        } 
        int[] res = new int[k];
        int count =0;
        for(int i=list.length-1;i>=0;i--){
            for(int val: list[i]){
                res[count]= val;
                count++;
                if(count==k){
                    return res;
                }
            }
        }
        return res;
        
    }
}
