import java.util.*;
class SortedArrayBetter{
    public static boolean CheckSorted(int input[],int startInd){
        // checks if startInd reaches at end position
        if(startInd>=input.length-1){
            return true;
        }
        if(input[startInd]>input[startInd+1]){
            return false;
        }

        boolean ans =CheckSorted(input,startInd+1);
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int input[]=new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }

        System.out.print(CheckSorted(input,0));
    }
}