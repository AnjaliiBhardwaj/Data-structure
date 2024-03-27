//Program to print all distinct elements of given input arrays. Also print the total of the distinct elements.
import java.util.*;
class Distinct{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
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

        HashSet<Integer> set=new HashSet<Integer> ();
        for(Integer ele: arr1){
            set.add(ele);
        }
        for(Integer ele: arr2){
            set.add(ele);
        }

        int sum=0;
        for(Integer ans: set){
            sum+=ans;
            System.out.print(ans+" ");
        }
        System.out.print(sum);
    }

}