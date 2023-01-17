#include <iostream>
using namespace std;

int duplicate(int arr[],int size){
    int ans=0;

    // Xor all array ele
    for (int i=0;i<size;i++){
        ans=ans^arr[i];
    }

    //Xor [1,n-1]
    for (int i=1;i<size-1;i++){
        ans=ans^i;
    }

    return ans;
}
int main(){
    int size;
    cin>>size;
    int arr[size];

    for (int i=0;i<size;i++){
        cin>>arr[i];
    }

    duplicate(arr, size);

}