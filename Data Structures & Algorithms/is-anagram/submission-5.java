class Solution {
    public boolean isAnagram(String s, String t) {


        int sLength = s.length();
        int tLength = t.length();
        // Map<Character, Integer> sCollect = new HashMap<>();
        // Map<Character, Integer> tCollect = new HashMap<>();
        if(sLength!=tLength){
            return false;
        }

        // for(int i=0 ; i<sLength;i++){
        //     sCollect.put(s.charAt(i), sCollect.getOrDefault(s.charAt(i), 0)+1);
        //     tCollect.put(t.charAt(i), tCollect.getOrDefault(t.charAt(i), 0)+1);
        // }
        // return sCollect.equals(tCollect);

        // char[] sChar = s.toCharArray();
        // char[] tChar = t.toCharArray();
        // int[] collect = new int[26];
        // for(int i =0;i<sLength;i++){
        //     collect[s.charAt(i)-'a']++;
        //     collect[t.charAt(i)-'a']--;
        // }
        // for(int n : collect){
        //     if(n!=0){
        //         return false;
        //     }
        // }
        // return true;


            
        

        // int slength = s.length();
        // int tlength = t.length();
        // Map<Character, Integer> sCount = new HashMap<>();
        // Map<Character, Integer> tCount = new HashMap<>();

        // if(slength!=tlength){
        //     return false;
        // }
        // for(int i = 0; i< s.length(); i++){
        //     sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0)+1);
        //     tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0)+1);
        // }
        // return sCount.equals(tCount);

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

            // int[] count = new int[26];
            // for(int i =0; i<s.length();i++){
            //     count[s.charAt(i)-'a']++;
            //     count[t.charAt(i)-'a']--;
            // }
            // for(int val: count){
            //     if(val!=0){
            //         return false;
            //     }
            // }
            // return true;







            // int[] collect = new int[26];
            // for(int i=0;i<s.length();i++){
            //     collect[s.charAt(i)-'a']++;
            //     collect[t.charAt(i)-'a']--;
            // }
            // for(int n: collect){
            //     if(n!=0){
            //         return false;
            //     }
            // }
            // return true;

            if(s.length()!=t.length()){
                return false;
            }

            char sChar[] = s.toCharArray();
            char tChar[] = t.toCharArray();
            Arrays.sort(sChar);
            Arrays.sort(tChar);
            return Arrays.equals(sChar,tChar);
        }

        

    }
