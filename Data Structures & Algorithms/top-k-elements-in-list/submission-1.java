class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> collect = new HashMap<>();
        for(int n : nums) {
            collect.put(n, collect.getOrDefault(n,0)+1);
        }
        List<Integer>[] sort = new List[nums.length+1];
        for(int i =0; i< sort.length; i++){
            sort[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry: collect.entrySet()){
            sort[entry.getValue()].add(entry.getKey());
        }
        int index =0;
        int[] array = new int[k];

        for(int i = sort.length-1 ; i>0 && k>index ; i--){
            for(int n: sort[i]){
                array[index]= n;
                index++;
                if(index==k){
                    return array;
                }
            }
        }
        return array;















    //     Map<Integer, Integer> collect = new HashMap<>();    
    //     for (int n : nums){
    //         collect.put(n, collect.getOrDefault(n,0)+1);
    //     }    
    //     List<Integer>[] freq = new List[nums.length+1];
    //     for(int i =0 ; i< freq.length; i++){
    //         freq[i] = new ArrayList<>();
    //     } 

    //     for(Map.Entry<Integer,Integer> entry : collect.entrySet()){
    //         freq[entry.getValue()].add(entry.getKey());
    //     }

    //     int [] res = new int[k];
    //     int index = 0;
    //     for(int i=freq.length-1 ; i>0 && index<k; i--){
    //         for(int n : freq[i]){
    //             res[index] =  n;
    //             index++;
    //             if(index==k){
    //                 return res;
    //             }
    //         }
    //     }
    //     return res;
    // }
    }
}
