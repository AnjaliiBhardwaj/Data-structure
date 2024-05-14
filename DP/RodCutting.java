import java.util.*;
class RodCutting{
    //Recursively
    // public static int solve(int n,int x,int y,int z){
    //     if(n==0){
    //         return 0;
    //     }
    //     if(n<0){
    //         return Integer.MIN_VALUE;
    //     }
    //     int a=solve(n-x,x,y,z)+1;
    //     int b=solve(n-y,x,y,z)+1;
    //     int c=solve(n-z,x,y,z)+1;

    //     int ans=Math.max(a,Math.max(b,c));
    //     return ans;
    // }
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int x=sc.nextInt();
    //     int y=sc.nextInt();
    //     int z=sc.nextInt();

    //     int ans=solve(n,x,y,z);
    //     if(ans<0){
    //         ans=0;
    //     }
    //     System.out.println(ans);
    // }

    //memoization
    // public static int solve(int n,int dp[],int x,int y,int z){
    //     if(n==0){
    //         return 0;
    //     }
    //     if(n<0){
    //         return Integer.MIN_VALUE;
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     int a=solve(n-x,dp,x,y,z)+1;
    //     int b=solve(n-y,dp,x,y,z)+1;
    //     int c=solve(n-z,dp,x,y,z)+1;

    //     return Math.max(a,Math.max(b,c));

    // }
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int x=sc.nextInt();
    //     int y=sc.nextInt();
    //     int z=sc.nextInt();

    //     int dp[]=new int[n+1];
    //     Arrays.fill(dp,-1);

    //     int ans=solve(n,dp,x,y,z);
    //     if(ans<0){
    //         ans=0;
    //     }
    //     System.out.println(ans);
    // }

    //tabulation
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);

        dp[0]=0;
        for(int i=1;i<=n;i++){
            //i-x can also lead to invalid index if x is -ve
            if((i-x)>=0 && dp[i-x]!=-1){
                dp[i]=Math.max(dp[i],dp[i-x]+1);
            }
            if(i-y >=0 && dp[i-y]!=-1){
                dp[i]=Math.max(dp[i],dp[i-y]+1);
            }
            if(i-z >=0 && dp[i-z]!=-1){
                dp[i]=Math.max(dp[i],dp[i-z]+1);
            }
        }
        if(dp[n]<0){
            System.out.print(0);
        }
        else{
            System.out.print(dp[n]);
        }
    }



}