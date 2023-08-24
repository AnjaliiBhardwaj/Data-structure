import java.util.*;
class LinearSearch{
    public static int LSearch(int x,int arr[]){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==x){
        return i;
      }
    }
    return -1;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int [size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        int result=LSearch(val,arr);
        System.out.print(result);
    }
}