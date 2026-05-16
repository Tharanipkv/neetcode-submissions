class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //count of overlapping intervals
        Arrays.sort(intervals, (a,b)->Integer.compare(a[1], b[1]));
        int prevEnd = intervals[0][1];
        int r=0;
        for(int i=1;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start>=prevEnd){
                prevEnd = end;
            }
            else{
                r++;
                prevEnd = Math.min(end, prevEnd);
            }
        }
        return r;
    }
}
