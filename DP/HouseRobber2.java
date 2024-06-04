class HouseRobber2{
    public int startInc(int s,int endInd,int nums[]){
        if(endInd<s){
            return 0;
        }
        int inc=nums[endInd]+endInc(s,endInd-2, nums);
        int exc=0+endInc(s,endInd-1, nums);
        return Math.max(inc,exc);
        
    }
    public int endInc(int s,int endInd,int nums[]){
        if(endInd<s){
            return 0;
        }
        int inc=nums[endInd]+endInc(s,endInd-2, nums);
        int exc=0+endInc(s,endInd-1, nums);
        return Math.max(inc,exc);
    }

    public int rob(int[] nums) {
        int size=nums.length;
        if (size == 1) return nums[0];
        int ans1=startInc(0,size-2,nums);
        int ans2=endInc(1,size-1,nums);
        return Math.max(ans1,ans2);
    }
}