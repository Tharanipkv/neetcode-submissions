class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(String str : strs){
            s.append(str.length()).append('#').append(str);
        }
        return s.toString();

    }

    public List<String> decode(String str) {
        
        List<String> list = new ArrayList<>();
        int l=0;
        while(l<str.length()){
            int i=l;
            while(str.charAt(i)!='#'){
                i++;
            }
            int length = Integer.parseInt(str.substring(l, i));
            l=i+1;
            i=i+length;
            list.add(str.substring(l, i+1));
            l=i+1;
        }
        return list;
    }
}
