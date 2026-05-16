class Solution {
    public boolean isAnagram(String s, String t) {
        int slength = s.length();
        int tlength = t.length();
        Map<Character, Integer> sCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();

        if(slength!=tlength){
            return false;
        }

            // for(int i=0; i<slength; i++){
            //     sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0)+ 1);
            //     tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i),0)+1);
            // }
            // return sCount.equals(tCount);

            // char[] sSort = s.toCharArray();
            // char[] tSort = t.toCharArray();

            // Arrays.sort(tSort);
            // Arrays.sort(sSort);
            // return Arrays.equals(tSort, sSort);

            int[] count = new int[26];
            for(int i =0; i<s.length();i++){
                count[s.charAt(i)-'a']++;
                count[t.charAt(i)-'a']--;
            }
            for(int val: count){
                if(val!=0){
                    return false;
                }
            }
            return true;
        }

        

    }
