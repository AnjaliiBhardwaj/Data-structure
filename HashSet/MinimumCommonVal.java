import java.util.*;
class MinimumCommonVal{
    public static int minVal(int arr1[],int arr2[],int n,int m){
        HashSet<Integer> set=new HashSet<>();
        for(Integer ele : arr1){
            set.add(ele);
        }//if arr is sorted
        for(Integer ele :arr2){
            if(set.contains(ele)){
                return ele;
            }
        }
        //if arr is not sorted then either can use linkedhashset or use below condition
        // int min=Integer.MAX_VALUE;
        // for(Integer i:nums2){
        //     if(ans.contains(i)){
        //         min=Math.min(i,min);
        //     }
        // }
        // if(min==Integer.MAX_VALUE){
        //     return -1;
        // }
        // else{
        //     return min;
        // }

        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }

        int ans=minVal(arr1,arr2,n,m);
        System.out.print(ans);
    }

}