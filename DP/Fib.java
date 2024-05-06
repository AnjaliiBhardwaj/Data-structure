class Fib{
    //---------------------------------------------------------------------------------------
    //     // top - down
    // public int fib(int n, int dp[]){
    //     if(n==0|| n==1){
    //         return n;
    //     }
    //     //step 3
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     //step 2
    //     dp[n]=fib(n-1)+fib(n-2);
    //     return dp[n];
    // }
  
    // public int fib(int n) {
    //     //step 1
    //     int dp[]=new int[n+1];
    //     for(int i=0;i<=n;i++){
    //         dp[i]=-1;
    //     }
    //     return fib(n,dp);
    // }
    
    //------------------------------------------------------------------------------
    //bottom up
    // public int fib(int n){
    //     if(n==0|| n==1){
    //         return n;
    //     }
    //     //step1
    //     int dp[]=new int[n+1];
    //     //step2
    //     dp[0]=0;
    //     dp[1]=1;
        
    //     for(int i=2;i<=n;i++){
    //         dp[i]=dp[i-1]+dp[i-2];
    //     }
    //     return dp[n];
    // }

    //----------------------------------------------------------------------
    //space  optimization
    public int fib(int n){
        if(n==0|| n==1){
            return n;
        }
        int prev1=1;
        int prev2=0;
        int current=0;

        for(int i=2;i<=n;i++){
            current=prev1+prev2;
            prev2=prev1;
            prev1=current;
        }   
        return current;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fibM(n));
    }
}