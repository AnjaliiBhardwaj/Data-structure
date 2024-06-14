class GetMinSquares{
    //recursive approach
    // public int rec(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     int ans=Integer.MAX_VALUE;
    //     for(int i=1;i*i<=n;i++){
    //         int temp=i*i;
    //         ans=Math.min(ans,1+MinSquares(n-temp));
    //     }
        
    //     return ans;
    // }
    //memoization ->top to down
    // public int memo(int n,int dp[]){
    //     if(n==0){
    //         return 0;
    //     }
    //     if(dp[n]!=-1){
    //         return (dp[n]);
    //     }
    //     int ans=Integer.MAX_VALUE;
    //     for(int i=1;i*i<=n;i++){
    //         int temp=i*i;
    //         ans=Math.min(ans,1+memo(n-temp,dp));
    //     }
    //     dp[n]=ans;
    //     return dp[n];
    // }
    
    //tabulation-> bottom-up
    public int tab(int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        
        dp[0]=0;
        // for every i how many min sq are possible
        for(int i=1;i<=n;i++){
            //repeat the same steps done to find min
            for(int j=1;j*j<=n;j++){
                int temp=j*j;
                if((i-temp) >=0)
                dp[i]=Math.min(dp[i],1+dp[i-temp]);
            }
        }
        return dp[n];
    }
    
    public int MinSquares(int n)
    {
        // Code here
        
        // int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // int ans=memo(n,dp);
        
        int ans=tab(n);
        return ans;
    }
}