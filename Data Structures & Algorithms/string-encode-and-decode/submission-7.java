class Solution {

    public String encode(List<String> strs) {

        StringBuilder str = new StringBuilder();
        for(String s : strs){
            str.append(s.length()).append("#").append(s);
        }
        return str.toString();

    }

    public List<String> decode(String str) {
        
        int i=0;
        List<String> s = new ArrayList<>();
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+length;
            s.add(str.substring(i,j));
            i=j;
        }
        return s;
    }
}
