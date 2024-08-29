import java.util.*;
class Coins{
    public static void helper(int target,String ans){
        // if(target==0){
        //     System.out.println(ans);
        //     return ;
        // }
        // if(target<0){
        //     return ;
        // }
        // // int oneRS=helper(target-1)+1;
        // // int twoRS=helper(target-2)+1;
        // // int threeRS=helper(target-3)+1;
        // // return oneRS+twoRS+threeRS;

        // //one
        // ans.add(1);
        // helper(target-1,ans);
        // ans.remove

        if(target<=0){
            if(target==0){
                System.out.println(ans);
            }
            return;
        }
        helper(target-1,ans+'1');
        helper(target-2,ans+'2');
        helper(target-3,ans+'3');

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        helper(target,"");
    }
}