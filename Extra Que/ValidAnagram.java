import jvaa.util.*;
class ValidAnagram{
    public static void main(String[] args){
        // String str1=s.replaceAll("\\s","").toLowerCase();
        // String str2=t.replaceAll("\\s","").toLowerCase();

        // char arr1[]=str1.toCharArray();
        // char arr2[]=str2.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // return Arrays.equals(arr1,arr2);

        //TC-> 0(nlogn),
        // if(s.length()!=t.length()){
        //     return false;
        // }
        // char arr1[]=s.toCharArray();
        // char arr2[]=t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // return Arrays.equals(arr1,arr2);

        //TC-> O(n)
        String str1=s.replaceAll("\\s","");
        String str2=t.replaceAll("\\s","");

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length()){
            return false;
        }
        // intilialize the bucket arr
        int arr[]=new int[26];

        //fill the bucket arr
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-'a']+=1;
        }

        //empty the arr
        for(int i=0;i<str2.length();i++){
            arr[str2.charAt(i)-'a']-=1;
        }

        //check all values it should not be either greator or less than 0
        for(Integer ele:arr){
            if(ele!=0){
                return false;
            }
        }
        return true;
    }
}