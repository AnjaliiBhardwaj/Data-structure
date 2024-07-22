import java.util.*;
class Subseq{
    // public static void helper(String str, String ans){
    //     if(str.length()==0){
    //         System.out.print(ans+" ");
    //         return;
    //     }
    //     //left
    //     helper(str.substring(1),ans);
    //     //right
    //     helper(str.substring(1),ans + str.charAt(0));
        
    // }

    //for dictionaty order
    public static ArrayList helper(String str, String ans,ArrayList arr){
        if(str.length()==0){
            arr.add(ans);
            return arr;
        }
        helper(str.substring(1), ans, arr);
        helper(str.substring(1),ans + str.charAt(0),arr);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList <String> arr=new ArrayList<>();
        String ans="";
        helper(str,ans,arr);
        Collections.sort(arr);
        System.out.print(arr);
    }
}