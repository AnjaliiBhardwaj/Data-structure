import java.util.*;
class MinCostTicket{
    public static int helper(int n, int days[], int costs[], int index){
        if(index>=n){
            return 0;
        }
        //one day pass
        int option1=costs[0]+helper(n, days, costs, index+1);
        //7 days pass
        //as 7 day pass is not always valid upto 7th index ,in this case cost val matters, as next val<=ith+7
        int i;
        for(i=index;i<n && days[i]<days[index]+7;i++);
        int option2=costs[1]+ helper(n, days, costs, i);

        //30 days pass
        for(i=index;i<n && days[i]<days[index]+30;i++);
        int option3=costs[2]+ helper(n, days, costs, i);

        return Math.min(option1,Math.min(option2,option3));
    }
    public static int memo(int n, int days[], int costs[], int index,int dp[]){
        if(index>=n){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }

        //one day
        int option1=costs[0]+ memo(n, days, costs, index+1, dp);
        // 7 day pass
        int i;
        for(i=index; i<n && days[i]<days[index]+7;i++ );
        int option2= costs[1]+ memo(n, days, costs, i, dp);

        // 30 day pass
        for(i=index;i<n && days[i]< days[index]+30;i++);
        int option3=costs[2] + memo(n, days, costs, i, dp);
        dp[index]= Math.min(option1,Math.min(option2, option3));   

        return dp[index];
    }
    public static int tab(int n, int days[], int costs[], int index){
        int dp[]=new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[n]=0;
        //index is replaced by j
        for(int j=n-1;j>=0;j--){
            int option1=costs[0]+ dp[j+1];

            int i;
            //7 days
            for(i=j;i<n && days[i]<days[j]+7;i++);
            int option2=costs[1]+ dp[i];
            //30 days
            for(i=j;i<n && days[i]<days[j]+30;i++);
            int option3=costs[2]+ dp[i];

            dp[j]=Math.min(option1,Math.min(option2,option3));
        }
        return dp[0];
     }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int days[]=new int[n];
        for(int i=0;i<n;i++){
            days[i]=sc.nextInt();
        }

        int costs[]=new int[3];
        costs[0]=sc.nextInt();
        costs[1]=sc.nextInt();
        costs[2]=sc.nextInt();

        // int ans=helper(n, days, costs, 0);
        // int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // int ans=memo(n, days, costs, 0, dp);
        int ans=tab(n,days,costs,0);
        System.out.print(ans);
    }
}