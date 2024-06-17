import java.util.*;
class SelectionSort{
    public static void helper(int n, int arr[]){
        int min=0;
        int minInd=-1;
        for(int i=0;i<n-1;i++){
            min=arr[i];
            minInd=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minInd=j;
                }
            }
            arr[minInd]=arr[i];
            arr[i]=min;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        helper(n,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}