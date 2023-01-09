#include <iostream>
using namespace std;

void rev(int arr[],int size){
    int start=0;
    int end=size-1;
    int temp= start;

    while (start<=end){
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }  
    }
void print(int arr[],int size){
    
    for (int i=0;i<size;i++){
        cout<<arr[i] <<" ";
    }
}
int main(){
    int size;
    cin>> size;

    int arr[size];

    for (int i=0;i<size;i++){
        cin>>arr[i];
    }

    rev( arr, size);
    print( arr,size);

    return 0;
}