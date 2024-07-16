import java.util.*;
class ValidAnagram{
    public static void main(String[] args){
        //T.C -> O(nlogn)
        //S.C -> O(1)
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        if(str1.length()!=str2.length()){
            System.out.print("false");
            return;
        }
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        // // Sort the character arrays
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // // Compare sorted arrays
        // if(Arrays.equals(arr1, arr2)){
        //     System.out.print("true");
        // } else {
        //     System.out.print("false");
        // }


        //T.c -> O(n)
        //S.c -> O(n)

        HashMap<Character, Integer> map=new HashMap<>();
        for(Character i: arr1){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
         // Decrease the count for each character in str2
        for(Character j:arr2){
            if(!map.containsKey(j) || map.get(j)==0){
                System.out.print("false");
                return;
            }
            map.put(j,map.get(j)-1);   
        }
        // If we reach here, it means str1 and str2 are anagrams
        System.out.print("true");
    }
}