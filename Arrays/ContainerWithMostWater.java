import java.util.*;
class ContainerWithMostWater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int area=0;
        int maxArea=0;
        while(left<right){
            //area length*width
            //water will overflow if we take the largest length , so always take min length
            area=Math.min(arr[left],arr[right])*(right-left);
            maxArea=Math.max(area,maxArea);
            if(arr[left]>arr[right]){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.print(maxArea);
    }
}