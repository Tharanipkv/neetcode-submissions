class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> collect = new HashSet<>();
       for(int n: nums){
          if(collect.contains(n)){
              return true;
           }
           collect.add(n);
        }
        return false;

       // Brute force
    //     for(int i=0; i<(nums.length-1);i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             System.out.println("i: "+i+ " j: "+ j);
    //             if(nums[i]==nums[j]){
    //                return true;
    //             }
    //         }
    //     }
    //    return false;

    //Steam API 
    // return Arrays.stream(nums).distinct().count() < nums.length;
       
   // HASHSET
        // Set<Integer> num = new HashSet<>();
        // for(int n:nums){
        //     if(num.contains(n)){
        //        return true;
        //     }
        //     else{
        //         num.add(n);
        //     }
        // }
        // return false;

    // SORTING
    // Arrays.sort(nums);
    //  for(int i=1;i<nums.length;i++){
    //     if(nums[i] == nums[i-1]){
    //         return true;
    //     }
    //  }
    //  return false;
    
    }
}