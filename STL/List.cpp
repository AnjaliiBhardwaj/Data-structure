/*
Lists are sequence containers that allow non-contiguous memory allocation.
As compared to the vector, the list has slow traversal, but once a position has been found, insertion and deletion are quick (constant time). 
Normally, when we say a List, we talk about a doubly linked list. 
For implementing a singly linked list, we use a forward_list.

*/
#include <iostream>
#include <list>
using namespace std;
int main(){
    list<int> l;
    list <int> n(5,100);
    cout<<"Printing n"<<endl;
    for(int i:n){
        cout<<i<<" "<<endl;
    } 

    /*
    rest of the things works same 
    */
   
}
