#include <iostream>
using namespace std;
int main(){
    int n;
    int max=0;
    cin>>n;
    int arr[n];

    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            if(arr[j]>arr[j+1]){
            max=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]= max;
        }
        }
        
    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}