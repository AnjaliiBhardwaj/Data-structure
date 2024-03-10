import java.util.*;
//inbuilt hashmap
class MapUSe{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();

        //insert
        map.put("anjali",1);
        map.put("rahul",2);
        map.put("riya",3);

        //check presence
        if(map.containsKey("anjali")){
            System.out.println("anjali");
        }
        if(map.containsKey("rahul")){
            System.out.println("rahul");
        }
        if(map.containsKey("riya")){
            System.out.println("riya");
        }

        //in map we do all work on key not on value except for one fxn below with O(n) time complexity
        if(map.containsValue(2)){
            System.out.print("has 2 val");
        }
        //get value
        int v=map.get("anjali");
        System.out.println(v);
        //if not present then null pointer exception
        //to handle that use bellow code only
        if(map.containsKey("anjalii")){
            v=map.get("anjalii");
        }
        System.out.println(v);

        //remove 
        int s=map.remove("riya");
        System.out.println(s);

        //iterate over map
        Set<String>keys=map.keySet();
        for(String str: keys){
            System.out.println(str);
        }
        //order is not maintained


    }
}