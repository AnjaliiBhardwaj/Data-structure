import java.util.*;
class ThreeSum{
    public List<List<Integer>> Sum (int arr[],int n){
        if(n<3){
            System.out.print (new ArrayList<>());
        }
        List <Integer> ans=new ArrayList<>();
        Arrays.sort(arr); // Sort the array to easily skip duplicates
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){  
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    ans.add(Arrays.asList(arr[i],arr[left],arr[right]));
                }
                left++;
                right--;
                if(sum<0){
                left++;
            }
            else{
                right--;
            }
            }
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sum(arr,n);
    }
}