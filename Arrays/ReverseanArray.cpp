#include <iostream>
using namespace std;
int main(){
    int size,j;
    cin>>size;
    int arr[size];

    for(int i=0;i<size;i++){
        cin>>arr[i];
    }
    for (int i=0;i<size;i++){
        int start=0;
        int end=size-1;

        while (start<=end){
            for(i=0;j<size;j--){
                int temp= arr[start];
                arr[start]=arr[end];
                arr[end]= temp; 
            }
        }

    }
    for (int i=0; i<size;i++){
        cout<< arr[i] << " ";
    }

}