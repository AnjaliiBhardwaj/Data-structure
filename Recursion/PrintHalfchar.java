import java.util.*;
class PrintHalfchar{
    public static String removeVal(String str,int start,String s){
        if(start>=str.length()){
            return s;
        }
        int count =1;
        while(start + 1 < str.length() && str.charAt(start)==str.charAt(start+1)){
            count++;
            start++;
        }
        int n=count/2;
        for(int i=0;i<n;i++){
            s+=str.charAt(start-1);
        }
        return removeVal(str,start+1,s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=removeVal(str,0,"");
        System.out.print(ans);
    }
}