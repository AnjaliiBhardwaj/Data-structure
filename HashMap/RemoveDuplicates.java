import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap <Integer,Integer> map= new HashMap<>();
        for(Integer i:arr){
            map.put(i);
        }
        for(Integer i:map){
            System.out.print(map.get(i)+" ");
        }

    }
}