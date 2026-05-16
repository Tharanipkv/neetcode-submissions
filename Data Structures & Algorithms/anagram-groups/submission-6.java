class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> collect = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            collect.putIfAbsent(Arrays.toString(count), new ArrayList<>());
            collect.get(Arrays.toString(count)).add(s);
        }
        return new ArrayList<>(collect.values());
        
    }
}
