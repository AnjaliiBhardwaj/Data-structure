class MaximumSubarray{
    public int maxSubArray(int[] nums) {
        //O(n*3)
        // int max=Integer.MIN_VALUE;
        // //starting index
        // for(int i=0;i<nums.length;i++){
        //     //last index
        //     for(int j=0;j<nums.length;j++){
        //         int sum=0;
        //         //to cal sum
        //         for(int k=i;k<=j;k++){
        //             sum+=nums[k];
        //         }
        //         max=Math.max(max,sum);
        //     }
        // }
        // return max;

        //O(n*2)
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        // current subarray = arr[i.....j]
        //add the current element arr[j]
        // to the sum i.e. sum of arr[i...j-1]
        //         sum+=nums[j];
        //         max=Math.max(sum,max);
        //     }
        // }
        // return max;

        //O(n)
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            // If sum < 0: discard the sum calculated
            if(sum<0){
                sum=0;
            }
            sum+=nums[i];
            max=Math.max(sum,max);
        }
        return max;
    }
}