class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            int prevEnd = list.get(list.size()-1)[1];
            if(start<=prevEnd){
                list.get(list.size()-1)[1] = Math.max(prevEnd, end);
            }
            else{
                list.add(intervals[i]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
