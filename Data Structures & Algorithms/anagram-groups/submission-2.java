class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> collect = new HashMap<>();
        for(String s : strs){
            char ch[] = s.toCharArray();
            int count[] = new int[26];
            for(char c : ch){
                count[c-'a']++;
            }
            collect.putIfAbsent(Arrays.toString(count), new ArrayList<>());
            collect.get(Arrays.toString(count)).add(s);
        }
        return new ArrayList<>(collect.values());
        




        // for(String str : strs){
        //     int[] count = new int[26];
        //     char[] chars = str.toCharArray();
        //     for(char c : chars){
        //         count[c-'a']++;
        //     }
        //     String countStr = Arrays.toString(count);
        //     collect.putIfAbsent(countStr, new ArrayList<>());
        //     collect.get(countStr).add(str);
        // }

       // return new ArrayList<>(collect.values());

        
    }
}
