import java.util.*;
class GroupAnagrams{
    //T.c-> O(n*klog(k)) -> k is the length of longest string to sort
    //S.c -> O(n*k) the space needed to store the input strings and the hash map.
    public static List<List<String>> helper(String arr[], int n){
        HashMap<String,List<String>> map=new HashMap<>();
        // Iterate through each string in the input array
        for(int i=0;i<n;i++){
            // Convert the string to a character array, sort it, and convert back to string
            char str[]=arr[i].toCharArray();
            Arrays.sort(str);
            String newStr=new String(str);
            // If the sorted string is not in the map, add it with a new list
            if(!map.containsKey(newStr)){
                map.put(newStr,new ArrayList<>());
            }
            // Add the original string to the list corresponding to the sorted string
            map.get(newStr).add(arr[i]);
        }
        // Return the values of the map as a list of lists
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println(helper(arr,n));
    }
}