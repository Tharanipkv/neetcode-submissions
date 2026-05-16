class Solution {
    public boolean hasDuplicate(int[] nums) {

        // boolean isequals = false;
        
        // for(int i=0; i<(nums.length);i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(i==j){
        //             isequals = true;
        //         }
        //         else{
        //             isequals = false;
        //         }
        //     }
        // }
        // if(isequals){
        //     return true;
        // }
        // else{
        //     return false;
        // }
       

        Set<Integer> num = new HashSet<>();
        for(int n:nums){
            if(num.contains(n)){
               return true;
            }
            else{
                num.add(n);
            }
        }
        return false;
    
    }
}