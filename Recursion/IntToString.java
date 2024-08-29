import java.util.*;
class IntToString{
    public static int helper(String num,int index,int ans){
        if(index>=num.length()){
            return ans;
        }
        ans=ans*10 + (num.charAt(index)- '0');
        return helper(num,index+1,ans);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        int ans=0;
        System.out.println('1'-'0');
        System.out.print(valueOf(helper(num,0,ans)));
    }
}