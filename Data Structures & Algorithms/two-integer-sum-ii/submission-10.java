class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // Map<Integer, Integer> collect = new HashMap<>();
        // int i =0;
        // for(int n : numbers){
        //     i++;
        //     int diff = target - n;
        //     if(collect.containsKey(diff)){
        //         return new int[]{collect.get(diff), i};
        //     }
        //     collect.put(n, i); 
        // }
        // return new int[]{};

        // int l =0;
        // int r = numbers.length-1;
        // while(l<r){
        //     int sum=numbers[l]+numbers[r];
        //     if(sum>target){
        //         r--;
        //     }
        //     else if(sum<target){
        //         l++;
        //     }
        //     else{
        //         return new int[]{l+1, r+1};
        //     }
        // }
        // return new int[]{};

        for(int i =0; i< numbers.length; i++){
            int l = i+1;
            int r = numbers.length-1;
            int diff = target - numbers[i];
            while(l<=r){
                int mid = l+ (r-l)/2;
                if(numbers[mid]>diff){
                    r = mid-1;
                }
                else if (numbers[mid]<diff){
                    l = mid+1;
                }
                else{
                    return new int[]{i+1, mid+1};
                }
            }
        }
        return new int[]{};
        

        // Map<Integer, Integer> collect = new HashMap<>();
        // int count = 0;
        // for(int n : numbers ){
        //     count++;
        //     int diff = target - n;
        //     if(collect.containsKey(diff)){
        //         return new int[]{collect.get(diff) , count};
        //     }
        //     collect.put(n, count);
        // }
        // return new int[]{};

        // int l =0;
        // int r = numbers.length-1;
        // while(l<r){
        //     int currSum = numbers[l]+numbers[r];
        //     if(currSum>target){
        //         r--;
        //     }
        //     else if(currSum<target){
        //         l++;
        //     }
        //     else{
        //         return new int[]{l+1, r+1};
        //     }

        // }
        // return new int[]{};

        // for(int i =0 ; i< numbers.length;i++){
        //     int diff = target- numbers[i];
        //     int l = i +1;
        //     int r = numbers.length-1;
        //     while(l<=r){
        //         int mid = l + (r - l)/2;
        //         if(numbers[mid]> diff){
        //             r= mid -1 ;
        //         }
        //         else if(numbers[mid]<diff){
        //             l = mid+1;
        //         }
        //         else{
        //             return new int[]{i+1, mid+1};
        //         }
        //     }
        // }
        // return new int[]{};

      
    }
}
