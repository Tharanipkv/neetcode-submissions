class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for(char c : str.toCharArray()){
                count[c-'a']++;
            }
            String cStr = Arrays.toString(count);
            map.putIfAbsent(cStr, new ArrayList<>());
            map.get(cStr).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
