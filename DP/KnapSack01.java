import java.util.*;
class KnapSack01{
    public static int solveMem(int W, int wt[], int val[], int index, int dp[][]){
        if(index==0){
            if (wt[0] <= W) 
            return val[0];
            else return 0;
        }
        if(index<0){
            return 0;
        }
        //Step3
        if(dp[index][W]!=-1){
            return dp[index][W];
        }
        //Step2
        int inc=0,exc=0;
        if(wt[index]<=W){
            inc=val[index]+solveMem(W-wt[index], wt, val, index-1,dp);
        }
        exc=0+solveMem(W, wt, val, index-1, dp);
        dp[index][W]= Math.max(inc,exc);
        
        return dp[index][W];
    }
    public static int solve(int W, int wt[], int val[], int index){
        //if only one ele
        if(index==0){
            if (wt[0] <= W) 
            return val[0];
            else return 0;
        }
        if(index<0){
            return -1;
        }
        
        int inc=0,exc=0;
        if(wt[index]<=W){
            inc=val[index]+solve(W-wt[index], wt, val, index-1);
        }
        exc=0+solve(W, wt, val, index-1);
        int ans= Math.max(inc,exc);
        
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int W=sc.nextInt();
        int n=sc.nextInt();
        int wt[]=new int[n];
        int val[]=new int[n];
        
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        // int sol=solve(W, wt, val, n-1);//n-1 index
        // System.out.print(sol);

        int dp[][]=new int[n][W+1];
         for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int sol= solveMem(W, wt, val, n-1, dp);
         System.out.print(sol);
    }
}