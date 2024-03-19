import java.util.*;
class IntersectionOfTwoArr{
    public static void intersection(int arr1[],int arr2[]){
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();

        for(int i=0;i<arr1.length;i++){
            if(map1.containsKey(arr1[i])){
                map1.put(arr1[i],map1.get(arr1[i])+1);
            }
            else{
                map1.put(arr1[i],1);
            }
        }
        for(int j=0;j<arr2.length;j++){
            if(map2.containsKey(arr2[j])){
                map2.put(arr2[j],map2.get(arr2[j])+1);
            }
            else{
                map2.put(arr2[j],1);
            }
        }

        for(int i=0;i<arr1.length;i++){
            if (map1.containsKey(arr1[i]) && map2.containsKey(arr1[i])) {
                int maxFreq = Math.min(map1.get(arr1[i]), map2.get(arr1[i]));
                for (int j = 0; j < maxFreq; j++) {
                    System.out.print(arr1[i] + " ");
                }
                map1.remove(arr1[i]); // Remove the element from map1 to avoid duplicate processing
                map2.remove(arr1[i]); // Remove the element from map2 to avoid duplicate processing
            }
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[]{3,5,1,3,2};
        int[] arr2=new int[]{2,3,2,3};
        intersection(arr1,arr2);

    }
}