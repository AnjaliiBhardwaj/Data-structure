import java.util.*;
class CheckIfArrayIsSorted{
    public static boolean checkSorted(int input[]){
        if(input.length<=1){
            return true;
        }
        if(input[0]>input[1]){
            return false;
        }

        int smallInput[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallInput[i-1]=input[i];
        }
        boolean ans= checkSorted(smallInput);
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int input[]=new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }
        System.out.print(checkSorted(input));
    }
}