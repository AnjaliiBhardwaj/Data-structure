import java.util.*;
class RemoveDuplicates{
    public static ArrayList<Integer> checkDuplicate(int arr[]){
        //O(n) space
        //rather than creating an extra arralist of boolean of n+1 size just create hashmap which will track if that ele is present or not
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap <Integer,Boolean> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                continue;
            }
            ans.add(arr[i]);
            map.put(arr[i],true);
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
        ArrayList <Integer> output=checkDuplicate(arr);
        for(int i=0;i<output.size();i++){
            System.out.print(output.get(i)+" ");
        }
    }
}