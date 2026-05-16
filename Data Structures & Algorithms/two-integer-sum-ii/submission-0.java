class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> collect = new HashMap<>();
        int count = 0;
        for(int n : numbers ){
            count++;
            int diff = target - n;
            if(collect.containsKey(diff)){
                return new int[]{collect.get(diff) , count};
            }
            collect.put(n, count);
        }
        return new int[]{};
    }
}
