class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countmap = new HashMap<>();
        for(int n: nums){
            countmap.put(n, countmap.getOrDefault(n,0)+1);
        }
        List<Integer>[] list = new List[nums.length+1];
        for(int i=0;i<list.length;i++){
            list[i] = new ArrayList<>();
        }        
        for(Map.Entry<Integer, Integer> entry : countmap.entrySet()){
            list[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int count=0;
        for(int i=list.length-1; i>=0;i--){
            for(int n : list[i]){
                res[count]= n;
                count++;
                if(count==k){
                    return res;
                }
            }
        }
        return res;
    }
}
