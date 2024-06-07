import java.util.*;
class CombinationalSum4{
    public static int solve(int arr[],int target){
        //no way to form it
        if(target<0){
            return 0;
        }
        //one way to form it 
        if(target==0){
            return 1;
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=solve(arr, target-arr[i]);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();
        int ans=solve(arr, target);
        System.out.print(ans);
    }
}