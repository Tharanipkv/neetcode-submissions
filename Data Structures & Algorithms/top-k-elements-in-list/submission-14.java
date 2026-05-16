class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        List<Integer>[] count = new List[nums.length+1];
        for(int i=0;i<count.length;i++){
            count[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            count[entry.getValue()].add(entry.getKey()); 
        }

        int[] res = new int[k];
        int n=0;
        for(int i=count.length-1;i>=0;i--){
            for(int num : count[i]){
                res[n++] = num;
                if(n==k){
                    return res;
                }
            }
        }
        return res;


        
    }
}
