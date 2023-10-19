/*Print Numbers
Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.*/
import java.util.*;
class PrintNum{
    public static void print(int n){
        if(n==0){
            return;
        }
        else{
            print(n-1);
            //Printing every recursive call 
            System.out.print(n+" ");
        }
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}