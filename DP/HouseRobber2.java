class HouseRobber2{
    //rec
    // public int startInc(int s,int endInd,int nums[]){
    //     if(endInd<s){
    //         return 0;
    //     }
    //     int inc=nums[endInd]+endInc(s,endInd-2, nums);
    //     int exc=0+endInc(s,endInd-1, nums);
    //     return Math.max(inc,exc);
        
    // }
    // public int endInc(int s,int endInd,int nums[]){
    //     if(endInd<s){
    //         return 0;
    //     }
    //     int inc=nums[endInd]+endInc(s,endInd-2, nums);
    //     int exc=0+endInc(s,endInd-1, nums);
    //     return Math.max(inc,exc);
    // }

    // public int rob(int[] nums) {
    //     int size=nums.length;
    //     if (size == 1) return nums[0];
    //     int ans1=startInc(0,size-2,nums);
    //     int ans2=endInc(1,size-1,nums);
    //     return Math.max(ans1,ans2);
    // }
    //Memo
    // public int startInc(int s,int endInd,int nums[],int dp1[]){
    //     if(endInd<s){
    //         return 0;
    //     }
    //     if(dp1[endInd]!=-1){
    //         return dp1[endInd];
    //     }
    //     int inc=nums[endInd]+endInc(s,endInd-2, nums, dp1);
    //     int exc=0+endInc(s,endInd-1, nums,dp1);
    //     dp1[endInd]= Math.max(inc,exc);
    //     return dp1[endInd];
    // }
    // public int endInc(int s,int endInd,int nums[],int dp2[]){
    //     if(endInd<s){
    //         return 0;
    //     }
    //     if(dp2[endInd]!=-1){
    //         return dp2[endInd];
    //     }
    //     int inc=nums[endInd]+endInc(s,endInd-2, nums, dp2);
    //     int exc=0+endInc(s,endInd-1, nums,dp2);
    //     dp2[endInd]= Math.max(inc,exc);
    //     return dp2[endInd];
    // }
    
    // public int rob(int[] nums) {
    //     int size=nums.length;
    //     if (size == 1) return nums[0];
    //     int dp1[]=new int[size];
    //     int dp2[]=new int[size];
    //     Arrays.fill(dp1,-1);
    //     Arrays.fill(dp2,-1);

    //     int ans1=startInc(0,size-2,nums,dp1);
    //     int ans2=endInc(1,size-1,nums,dp2);
    //     return Math.max(ans1,ans2);
    // }

    // public int robHelper(int s, int end, int nums[]){
    //     int n=end-s+1;
    //     int dp[]=new int[n];
    //     dp[0]=nums[s];
    //     dp[1]=Math.max(nums[s],nums[s+1]);

    //     for(int i=2;i<n;i++){
    //         dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i+s]);//why i+s because 2nd arr s from 1 not 0
    //     }
    //     return dp[n-1]; //0 based indexing
    // }
    // public int rob(int[] nums) {
    //     int size=nums.length;
    //     if (size == 1)
    //      return nums[0];
    //     if(size==2){
    //         return Math.max(nums[0],nums[1]);
    //     }
    //     return Math.max(robHelper(0,size-2,nums),robHelper(1,size-1,nums));
    // }

    //space otimization
    public int robHelper(int s, int end, int nums[]) {
        int prev1 = 0; // equivalent to dp[i-1]
        int prev2 = 0; // equivalent to dp[i-2]
        for (int i = s; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1; // equivalent to dp[n-1]
    }

    public int rob(int[] nums) {
        int size = nums.length;
        if (size == 1) 
        return nums[0];
        if (size == 2) {
            return Math.max(nums[0], nums[1]);
        }

        // Rob houses from 0 to size-2 and from 1 to size-1, take the maximum
        return Math.max(robHelper(0, size - 2, nums), robHelper(1, size - 1, nums));
    }
}