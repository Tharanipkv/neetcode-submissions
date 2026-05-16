class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> group = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            String str = Arrays.toString(count);
            group.putIfAbsent(str, new ArrayList<>());
            group.get(str).add(s);
        }

        return new ArrayList<>(group.values());
        
    }
}
