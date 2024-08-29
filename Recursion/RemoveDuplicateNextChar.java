import java.util.*;
class RemoveDuplicateNextChar{
    // public static String helper(String str,int index){
    //     if(index>=str.length()){
    //         return str;
    //     }
    //     if((index+1)<str.length()){
    //         if(str.charAt(index)==str.charAt(index+1)){
    //         helper(str.substring(0,index)+str.substring(index+1),index+1);
    //     }
    //     }
    //     return helper(str,index+1);
    // }

    public static String helper(String str,int index,String ans){
        if(index>=str.length()-1){
            return ans+str.charAt(index);
        }
        if(str.charAt(index)!=str.charAt(index+1)){
            ans+=str.charAt(index);
        }
        // handeled it in base case if reached at last index then add it to the string
        // else if ((index + 1) == str.length()) {
        //     ans += str.charAt(index);
        // }
        return helper(str, index + 1, ans);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans="";
        System.out.println(helper(str,0,ans));
    }
}