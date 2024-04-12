import java.util.*;
class Fibonacci{
    public static int fibM(int n){
        int storage[]=new int[n+1];
        for(int i=0;i<=n;i++){
            storage[i]=-1;
        }

        return fibM(n,storage);
    }

    public static int fibM(int n,int storage[]){
        if(n==0 || n==1){
            return n;
        }
        // handling the case if already preset then no need to solve again just return that present value
        if(storage[n]!=-1){
            return storage[n];
        }
        storage[n]=fibM(n-1, storage)+ fibM(n-2, storage);
        return storage[n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fibM(n));
    }
}