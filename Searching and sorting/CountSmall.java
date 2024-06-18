// You are given two arrays of integers. Let's call the first array A and the second array B. 
// A finds the number of elements in array B that are smaller 
// than or equal to that element for every array element.
import java.util.*;
class CountSmall{
     public static int[] countS(int n, int m, int []a, int []b) {
        // Write your code here.
        int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=0;j<m;j++){
        //         if(a[i]>=b[j]){
        //             count++;
        //         }
        //     }
        //     arr[i]=count;
        // }
        // return arr;
        for(int i=0;i<n;i++){
            int count=0;
            int s=0;
            int e=m-1;
            int mid=s+(e-s)/2;
            while(s<=e){
                mid = s + (e - s) / 2;
                if(a[i]>=b[mid]){
                    count=mid+1;
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}