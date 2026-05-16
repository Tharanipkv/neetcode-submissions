class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> count = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0)+1);
        }
        List<Integer>[] list = new List[nums.length+1];
        for(int j=0;j<list.length;j++){
            list[j] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            list[entry.getValue()].add(entry.getKey());
        }

        int count1 =0;
        int[] res = new int[k];
        for(int i= list.length-1 ;i>=0 && count1<k ;i-- ){
            for(int n :list[i]){
                res[count1]  = n;
                count1++;
                if(count1==k){return res;}
            }

        }
        return res;

    }
}
