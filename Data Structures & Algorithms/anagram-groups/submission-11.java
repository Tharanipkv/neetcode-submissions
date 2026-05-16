class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> collect = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for(int i=0;i<str.length();i++){
                count[str.charAt(i)-'a']++;
            }
            collect.putIfAbsent(Arrays.toString(count), new ArrayList<>());
            collect.get(Arrays.toString(count)).add(str);
        }
        return new ArrayList<>(collect.values());
    }
}
