//Distributing M items in a circle of size N starting from K-th position
//M items are to be delivered in a circle of size N. Find the position where the M-th item will be delivered if we start from a given position K. Note that items are distributed at adjacent positions starting from K.
import java.util.*;
class DistributeInCircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int ans;
        
        
        ans=(k+m-2)%n + 1;
        System.out.print(ans);
        
    }
}