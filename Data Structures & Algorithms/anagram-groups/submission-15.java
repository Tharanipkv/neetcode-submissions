class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
            }
            if(!map.containsKey(Arrays.toString(count))){
                map.put(Arrays.toString(count), new ArrayList<>());
            }
           // map.putIfAbsent(Arrays.toString(count), new ArrayList<>());
            map.get(Arrays.toString(count)).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
