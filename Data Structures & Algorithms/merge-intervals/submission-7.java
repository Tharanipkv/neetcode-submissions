class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int[] interval : intervals){
            int start = interval[0];
            int end = interval[1];
            int lastEnd = list.get(list.size()-1)[1];
            if(start<=lastEnd){
                list.get(list.size()-1)[1] = Math.max(end, lastEnd);
            }
            else{
                list.add(interval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
