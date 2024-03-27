//Program to remove all vowels from a given string using pointers
import java.util.*;
class RemoveVowel{
    public static boolean isVowel(char i){
        return i=='A' || i=='E'|| i=='I'|| i=='O' || i=='U'|| i=='a'|| i=='e'|| i=='i'|| i=='o' || i=='u';
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        
        String strs="";
        for(int i=0;i<arr.length;i++){
            char currentChar = arr[i];
            if(!isVowel(currentChar)){
                strs+=arr[i];
            }
        }
        System.out.print(strs);
    }
}