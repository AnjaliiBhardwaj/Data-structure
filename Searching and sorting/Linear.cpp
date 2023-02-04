#include <iostream>
using namespace std;

int linSearch(int arr[],int size,int ele){
    for (int i=0;i<size;i++){
        if(arr[i]==ele){
            return i;
        }
    }
    return -1;

}
int main(){
    int size,ele;
    cin>>size;
    

    int arr[size];

    for (int i=0;i<size;i++){
        cin>>arr[i];
    }
    cout<< "Enter Your elemet to Search:"<<endl;
    cin>>ele;

    int result = linSearch(arr, size , ele);
    if (result== -1){
        cout<< " Element is not present ";
    }
    else{
        cout<< " Element is present at index: " << result;
    }

    return 0;
}