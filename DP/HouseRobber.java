class HouseRobber{
    // public int helper(int nums[], int index){
    //     if(index==0){
    //         return nums[index];
    //     }
    //     if(index < 0){
    //         return 0;
    //     }
    //     int inc=nums[index]+helper(nums,index-2);
    //     int exc=0+helper(nums,index-1);
        
    //     return Math.max(inc,exc);
    // }
    //memoization
    // public int helper(int nums[], int index, int dp[]){
    //     if(index==0){
    //         return nums[index];
    //     }
    //     if(index < 0){
    //         return 0;
    //     }
    //     if(dp[index]!=-1){
    //         return dp[index];
    //     }

    //     int inc=nums[index]+helper(nums,index-2,dp);
    //     int exc=0+helper(nums,index-1,dp);
        
    //     dp[index]= Math.max(inc,exc);
    //     return dp[index];
    // }
    // public int rob(int[] nums) {
    //     int dp[]=new int[nums.length+1];
    //     Arrays.fill(dp,-1);
    //     return helper(nums,nums.length-1,dp);
    // }

    //tabulation
    // public int rob(int[] nums){
    //     int n=nums.length;
    //     // Handle edge cases when nums is empty or contains only one element
    //     if (n == 0) {
    //         return 0;
    //     }
    //     if (n == 1) {
    //         return nums[0];
    //     }
    //     int dp[]=new int[n];

    //     dp[0]=nums[0];
    //     dp[1]=Math.max(nums[0],nums[1]);

    //     for(int i=2;i<n;i++){
    //         dp[i]=Math.max((dp[i-2]+nums[i]),dp[i-1]);
    //     }
    //     return dp[n-1];
    // }

    //space optomized
    public int rob(int[] nums){
        int n=nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        //store the max value up to the previous house and the house before that
        int prev2=nums[0];
        int prev1=Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){
            int current=Math.max((prev2+nums[i]),prev1);
            prev2=prev1;
            prev1=current;
        }
        return prev1;

    }
}