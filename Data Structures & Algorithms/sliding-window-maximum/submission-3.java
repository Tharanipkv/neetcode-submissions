class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new LinkedList<>();
        int n =nums.length;
        int[] output = new int[n-k+1];
        int l=0;
        for(int r=0;r<nums.length;r++){
            while(!q.isEmpty() && nums[q.getLast()]<nums[r]){
                q.removeLast();
            }
            q.addLast(r);
            if(l>q.getFirst()){
                q.removeFirst();
            }
            if((r+1)>=k){
                output[l] = nums[q.getFirst()];
                l++;
            }
        }
        return output;
        
    }
}
