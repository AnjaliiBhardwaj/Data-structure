import java.util.*;
class CombinationalSum4{
    //tabulation
    public static int tab(int arr[],int target){
        int dp[]=new int[target+1];
        Arrays.fill(dp,0);

        //analyze teh base case
        dp[0]=1;
        for(int i=1;i<=target;i++){
            for(int j=0;j<arr.length;j++){
                if((i-arr[j])>=0)
                dp[i]+=dp[i-arr[j]];
            }
        }
        return dp[target];
    }
    // public static int memo(int arr[], int target, int dp[]){
    //     if(target<0){
    //         return 0;
    //     }
    //     if(target==0){
    //         return 1;
    //     }
    //     if(dp[target]!=-1){
    //         return dp[target];
    //     }

    //     int ans=0;
    //     for(int i=0;i<arr.length;i++){
    //         ans+=memo(arr, target-arr[i], dp);
    //     }
    //     dp[target]=ans;
    //     return dp[target];
    // }
    // public static int solve(int arr[],int target){
    //     //no way to form it
    //     if(target<0){
    //         return 0;
    //     }
    //     //one way to form it 
    //     if(target==0){
    //         return 1;
    //     }
    //     int ans=0;
    //     for(int i=0;i<arr.length;i++){
    //         ans+=solve(arr, target-arr[i]);
    //     }
    //     return ans;
    // }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();
        // int dp[]=new int[target+1];
        // Arrays.fill(dp,-1);
        int ans=tab(arr, target);
        System.out.print(ans);
    }
}