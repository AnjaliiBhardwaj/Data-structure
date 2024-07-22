import java.util.*;
class Toss{
    public static void helper(int n,String ans, int index){
        if(index==n){
            System.out.print(ans);
            return;
        }
        //h inc or exc
        helper(n, ans+"h", index+1);
        // helper(n, ans,index+1);
        //t inc or exc
        helper(n,ans+"t",index+1);
        // helper(n, ans, index+1);
    }
    //no consequitive head ans tail
    public static void helper2(int n,String ans, int index,int count){
        if(index==n){
            System.out.print(ans);
            return;
        }if(count<1){
            //h inc or exc
        helper2(n, ans+"h", index+1,count+1);
        //t inc or exc
        helper2(n,ans+"t",index+1,0);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        // helper(n,ans, 0);
        helper2(n, ans,0,0);
        
    }
}