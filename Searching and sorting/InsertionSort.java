import java.util.*;
class InsertionSort{
    public static void helper(int n, int arr[]){
        int key,j;
        for(int i=0;i<n;i++){
            key=arr[i];
            j=i;
            while(j>0 && arr[j-1]>key){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=key;
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