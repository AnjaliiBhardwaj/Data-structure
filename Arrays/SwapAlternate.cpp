#include <iostream>
using namespace std;

void swapAlt(int arr[], int size){
    int temp;
    
    for (int i=0;i<size; i+=2){
        int start=i;
        int next=i+1;
        if((i+1)<size){
            temp= arr[start];
            arr[start]= arr[temp];
            arr[next]= temp;
        }
    }
}

int main(){
    int size;
    cin>>size;

    int arr[size];
    for (int i=0;i<size;i++){
        cin>>arr[i];
    }

    swapAlt( arr, size);

    for (int i=0;i<size;i++){
         cout<<arr[i]<<" ";
    }
   

}