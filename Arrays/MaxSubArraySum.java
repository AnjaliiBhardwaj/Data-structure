//Max Sum Subarray of size K
class MaxSubArraySum{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        // int s=0;
        // int e=0;
        // long sum=0;
        // long maxSum=Long.MIN_VALUE;
        // while(e<N){
        //     sum+=Arr.get(e);
        //     if(e-s+1==K){
        //       maxSum=Math.max(sum,maxSum);
        //       sum=sum-Arr.get(s);
        //       s++;
        //   }
        //   e++;
        // }
        // return maxSum;
        
        long sum=0;
        long maxSum=Long.MIN_VALUE;
        for(int i=0;i<K;i++){
            sum+=Arr.get(i);
        }
        maxSum=sum;
        for(int j=K;j<N;j++){
            sum+=Arr.get(j)-Arr.get(j-K);
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}