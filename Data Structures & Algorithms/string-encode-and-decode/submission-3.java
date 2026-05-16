class Solution {

    public String encode(List<String> strs) {
        StringBuilder str= new StringBuilder();
        for(String s: strs){
            int length = s.length();
            str.append(length).append("#").append(s);
        }
        return str.toString();

    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            // StringBuilder s = new StringBuilder();
            // while(str.charAt(i)!='#'){
            //     s.append(str.charAt(i));
            //     i++;
            // }
            // int length = Integer.parseInt(s.toString());
            // i++;
            // StringBuilder strDecode = new StringBuilder();
            // for(int j=i;j<i+length;j++){
            //     strDecode.append(str.charAt(j));
            // }
            // decode.add(strDecode.toString());
            // i=i+length;
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+length;
            decode.add(str.substring(i,j));
            i=j;
            
        }
        return decode;

    }
}
