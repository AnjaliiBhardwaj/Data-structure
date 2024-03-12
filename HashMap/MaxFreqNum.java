import java.util.*;
class MaxFreqNum{
    public static int Num(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        //iteration through hashmap is not possible so we have to iterate through arr
        int maxKey=Integer.MIN_VALUE;
        int maxVal=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                if(map.get(arr[i])>maxVal){
                    maxVal=map.get(arr[i]);
                    maxKey=arr[i];
                }
            }
        }
        return maxKey;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=Num(arr);
        System.out.print(ans);

    }
}