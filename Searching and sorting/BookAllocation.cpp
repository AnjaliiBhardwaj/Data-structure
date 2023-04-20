#include <bits/stdc++.h>
using namespace std;

int ifPossible(vector <int> arr, int n, int m, int mid){
    int studentCount=1;
    int pageSum=0;
    for(int i=0;i<n;i++){
        if(pageSum + arr[i] <= mid){
            pageSum+=arr[i];

        }
        else{
            studentCount++;
            if(studentCount >m || arr[i]> mid){
                return false;
            }
            pageSum=arr[i];
        }
    }
}
int bSearch(vector <int> arr, int n, int m){
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    int start=0;
    int end=sum;
    int ans=-1;
    int mid=start +(end-start)/2;

    while(start<=end){
        if(ifPossible(arr, n , m, mid)){
            ans=mid;
            end=mid-1;
        }
        else{
            start=mid+1;
        }
        mid=start+(end-start)/2;
    }
    return ans;
}
