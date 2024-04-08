import java.util.*;
class UniqueChar{
    public static String uniqueChar(String str){
        // ArrayList<Character> arr=new ArrayList<>();
        // for(int i=0;i<str.length();i++){
        //     if(!arr.contains(str.charAt(i))){
        //         arr.add(str.charAt(i));
        //     }
        // }
        // String strr="";
        // for(int i=0;i<arr.size();i++){
        //     strr+=arr.get(i);
        // }

        // return strr;

        //Using HashMap
        HashMap<Character,Integer> map= new HashMap<>();
        String strr="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!map.containsKey(c)){
                strr+=c;
                map.put(c,1);
            }
        }

        return strr;

	}


}