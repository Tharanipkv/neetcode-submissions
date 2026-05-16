class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int n=nums.length;
        List<Integer>[]  list = new List[n+1];
        for(int i=0;i<list.length;i++){
            list[i] = new ArrayList<>();
        }  
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            list[entry.getValue()].add(entry.getKey());
        }      
        int count =0;
        int[] res = new int[k];
        for(int i=list.length-1;i>=0 && count<k ;i--){
            for(int n1 : list[i]){
                res[count] = n1;
                count++;
                if(count==k){
                    return res;
                }
            }
        }
        return res;
    }
}
