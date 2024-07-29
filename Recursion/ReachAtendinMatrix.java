//from 1st cell reach to the end cell, write all the possible ways, if you move in right direction print R for that cell, if in downwards then print D
import java.util.*;
class ReachAtendinMatrix{
    public static void helper(int r,int c, int n, int m, String ans){
        if(r==n-1 && c==m-1){
            System.out.println(ans);
            return;
        }
        
        if(c>=m || r>=n){
            return;
        }
        helper(r+1,c, n, m,ans+"D");
        helper(r, c+1, n, m ,ans+"R");
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       String ans="";
       helper(0,0,n,m,ans);
    }
}