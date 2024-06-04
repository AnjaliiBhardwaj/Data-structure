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
    public int startInc(int s,int endInd,int nums[],int dp1[]){
        if(endInd<s){
            return 0;
        }
        if(dp1[endInd]!=-1){
            return dp1[endInd];
        }
        int inc=nums[endInd]+endInc(s,endInd-2, nums, dp1);
        int exc=0+endInc(s,endInd-1, nums,dp1);
        dp1[endInd]= Math.max(inc,exc);
        return dp1[endInd];
    }
    public int endInc(int s,int endInd,int nums[],int dp2[]){
        if(endInd<s){
            return 0;
        }
        if(dp2[endInd]!=-1){
            return dp2[endInd];
        }
        int inc=nums[endInd]+endInc(s,endInd-2, nums, dp2);
        int exc=0+endInc(s,endInd-1, nums,dp2);
        dp2[endInd]= Math.max(inc,exc);
        return dp2[endInd];
    }
    
    public int rob(int[] nums) {
        int size=nums.length;
        if (size == 1) return nums[0];
        int dp1[]=new int[size];
        int dp2[]=new int[size];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        int ans1=startInc(0,size-2,nums,dp1);
        int ans2=endInc(1,size-1,nums,dp2);
        return Math.max(ans1,ans2);
    }
}