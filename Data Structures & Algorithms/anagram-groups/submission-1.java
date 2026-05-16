class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        



        Map<String, List<String>> collect = new HashMap<>();
        for(String s: strs){
            char sChar[] = s.toCharArray();
            int[] sCollect = new int[26];
            for(char c: sChar){
                sCollect[c-'a']++;
            } 
            collect.putIfAbsent(Arrays.toString(sCollect), new ArrayList<>());
            collect.get(Arrays.toString(sCollect)).add(s);
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
