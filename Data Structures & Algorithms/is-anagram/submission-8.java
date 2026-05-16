class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> collect = new HashMap<>();
        Map<Character, Integer> collect1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            collect.put(s.charAt(i), collect.getOrDefault(s.charAt(i),0)+1);
            collect1.put(t.charAt(i), collect1.getOrDefault(t.charAt(i),0)+1);
        }
        return collect.equals(collect1);

    }

}
