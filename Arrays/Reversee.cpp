//two pointer approach
//1 2 3 4 s=1, e=4, and swap afterthat s++ e--
#include <iostream>
int main(){
    int size,s=0 , e, temp;
    std::cin>>size;
    e=size -1;
    int arr[size]; 

    for(int i=0; i<size;i++){
        std::cin>> arr[i];
    }
    while(s<=e){
        temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
    }

    for(int i=0;i<size;i++){
        std::cout <<arr[i]<<" ";
    }
    return 0;
}