class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> collect = new HashMap<>();
        for(String str : strs){
            int[] res = new int[26];
            for(char c : str.toCharArray()){
                res[c-'a']++;
            }
            String key = Arrays.toString(res);
            collect.putIfAbsent(key, new ArrayList<>());
            collect.get(key).add(str);
        }
        return new ArrayList<>(collect.values());
        
    }
}
