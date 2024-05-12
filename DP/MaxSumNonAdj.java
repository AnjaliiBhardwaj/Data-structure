import java.util.*;
class MaxSumNonAdj{
    //recursively
    //we have only two options either we will include the ele or will not include it
    // public static int solve(int arr[],int n){
    //     //base case
    //     if(n<0){
    //         return 0;
    //     }
    //     if(n==0){
    //         return arr[0];
    //     }
    //     int inc=solve(arr,n-2)+arr[n];
    //     int exc=solve(arr,n-1)+0;
    //     return Math.max(inc,exc);
    // }
    
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int ans=solve(arr,n-1);//passing last index
    //     System.out.println(ans);
    // }
// ------------------------------------------------------------------------------//
    //Memoization 

    // public static int solve(int arr[],int dp[],int n){
    //     if(n<0){
    //         return 0;
    //     }
    //     if(n==0){
    //         return arr[0];
    //     }
    //     //Step-3
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     //Step - 2
    //     int inc=solve(arr,dp,n-2)+arr[n];
    //     int exc=solve(arr,dp,n-1)+0;
    //     dp[n]=Math.max(inc,exc);

    //     return dp[n];
    // }
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     //Step-1
    //     int dp[]=new int[n+1];
    //     Arrays.fill(dp,-1);
    //     int ans=solve(arr,dp,n-1);//passing last index
    //     System.out.println(ans);
    // }

    //Tabulation 
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }

    //     int dp[]=new int[n];
    //     Arrays.fill(dp,0);
    //     dp[0]=arr[0];
    //     for(int i=1;i<n;i++){
    //         int incl=dp[i-2] +arr[i];
    //         int exc=dp[i-1]+ 0;
    //         dp[i]=Math.max(incl,exc);
    //     }
    //     System.out.print(dp[n-1]);
    // } 

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int prev2=0;
       int prev1=arr[0];

       for(int i=0;i<n;i++){
        int inc=prev2+arr[i];
        int exc=prev1+0;
        int ans=Math.max(inc,exc);
        prev2=prev1;
        prev1=ans;
       }
       System.out.println(prev1);
    }



}