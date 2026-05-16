class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int r=numbers.length-1;
        int l=0;
        while(r>l){
            int sum = numbers[r]+numbers[l];
            if(sum>target){
                r--;
            }
            else if (sum<target){
                l++;
            }
            else{
                return new int[]{l+1, r+1};
            }
        }
        return new int[]{};
    }
}
