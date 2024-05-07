import java.util.*;
class MinCostClimbingStairs{
    //recursive approach
    // public int minCostClimbingStairs(int[] cost,int n){
    //     if(n>=cost.length){
    //         return 0;
    //     }
    //     int oneStep=Integer.MIN_VALUE;
    //     int twoStep=Integer.MAX_VALUE;
    //     oneStep=cost[n]+minCostClimbingStairs(cost,n+1);
    //     twoStep=cost[n]+minCostClimbingStairs(cost,n+2);
    //     return Math.min(oneStep,twoStep);
    // }
    // public int minCostClimbingStairs(int[] cost) {
    //     return Math.min(minCostClimbingStairs(cost,0),minCostClimbingStairs(cost,1));
    // }

    //dp with memoization
    // public int minCostClimbingStairs(int dp[],int[] cost,int n){
    //     if(n>=cost.length){
    //         return 0;
    //     }
    //     //step 3 if already exists then do not do recursive call 
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     //step2 do only needful recursion
    //     int oneStep=Integer.MIN_VALUE;
    //     int twoStep=Integer.MAX_VALUE;
    //     oneStep=cost[n]+minCostClimbingStairs(dp,cost,n+1);
    //     twoStep=cost[n]+minCostClimbingStairs(dp,cost,n+2);

    //     dp[n]=Math.min(oneStep,twoStep);
    //     return dp[n];
    // }
    // public int minCostClimbingStairs(int[] cost) {
    //     int size=cost.length;
    //     //step1
    //     int dp[]=new int[size+1];
    //     for(int i=0;i<=size;i++){
    //         dp[i]=-1;
    //     }
    //     return Math.min(minCostClimbingStairs(dp,cost,0),minCostClimbingStairs(dp,cost,1));
    // }

    //bottom up approach 1d dp
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        dp[0]=cost[0];
        dp[1]=cost[1];

        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cost[]=new int[n];

    }
}