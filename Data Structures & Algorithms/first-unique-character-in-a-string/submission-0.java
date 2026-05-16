class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int minCount = 0;
        for(int i=0;i<s.length();i++){
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i) ,0)+1);
        }
        int i=0;
        for(char c : s.toCharArray()){
            if(count.get(c)==1){
                return i;
            }
            i++;
        }
        return -1;

        
    }
}