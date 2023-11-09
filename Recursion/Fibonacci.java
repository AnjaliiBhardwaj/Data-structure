import java.util.*;
class Fibonacci{
    public static int fib(int num){
        if(num==0|| num==1){
            return num;
        }
        else{
            return fib(num-1)+fib(num-2);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}