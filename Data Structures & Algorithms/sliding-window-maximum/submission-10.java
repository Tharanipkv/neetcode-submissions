class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       
        int l=0;
        int n=nums.length;
        int[] output = new int[n-k+1];
        Deque<Integer> q = new LinkedList<>();
        for(int r=0;r<n;r++){
            while(!q.isEmpty() && nums[q.getLast()]<nums[r] )
            {
                q.removeLast();
            }
            q.add(r);
            if(!q.isEmpty() && l>q.getFirst()){
                q.removeFirst();
            }
            if(r+1>=k){
                output[l] = nums[q.getFirst()];
                l++;
            }
        }
        return output;
        
    }
}
