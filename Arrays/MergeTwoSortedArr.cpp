#include <iostream>
#include <vector>
#include <numeric> //For accumulate operation
using namespace std;

void merge(int arr1[],int n,int arr2[],int m, int arr3[]){
    // refering to 1st index
    int i=0;
    int j=0;
    int k=0;
    while(i <n && j <m){
        if(arr1[i]<arr2[j]){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        else{
            arr3[k]=arr2[j];
            k++;
            j++;
        }
    }
        // now as remaining ele are already sorted in arr1/arr2 just copy it in new array
        //if n>m
        while(i<n){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            arr3[k]=arr2[j];
            k++;
            j++;
        }  
    }


void printing (int final[],int n){
    for(int i =0;i<n;i++){
        cout<<final[i]<<" ";
    }
    cout<<endl;

}
int main(){
    int arr1[5]= {1,3,5,7,9};
    int arr2[3]={2,4,6};
    int arr3[8]={0};

    merge(arr1,5,arr2,3,arr3);
    printing(arr3,8);

    return 0;

}