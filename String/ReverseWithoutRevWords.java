import java.util.*;
//input----- i.like.this.program.very.much
//output----- much.very.program.this.like.i
class ReverseWithoutRevWords{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder ans=new StringBuilder();
        String[] arr=str.split("\\.");
        for(int i=arr.length-1;i>=0;i--){
            ans.append(arr[i]);
            if(i!=0){
                ans.append(".");
            }
        }
        ans.toString();
        System.out.print(ans);
    }
}