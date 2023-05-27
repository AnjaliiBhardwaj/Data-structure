/*
A C++ priority queue is a type of container adapter,
specifically designed such that the first element of the
queue is either the greatest or the smallest of all elements in the queue, 
and elements are in non-increasing or non-decreasing order 
(hence we can see that each element of the queue has a priority {fixed order}).

In C++ STL, the top element is always the greatest by default. We can also change
it to the smallest element at the top. Priority queues are built on the top of the 
max heap and use an array or vector as an internal structure. In simple terms, STL Priority 
Queue is the implementation of Heap Data Structure.
*/


#include <iostream>
#include <queue>
using namespace std;
int main(){
    //max heap
    priority_queue<int> maxi;

    //min heap
    priority_queue <int,vector <int> , greater <int>> mini;

    maxi.push(45);
    maxi.push(2);
    maxi.push(3);
    maxi.push(4);

    int n=maxi.size();
    for(int i=0;i<n;i++){
        std::cout<<maxi.top()<<" ";
        maxi.pop();
    }
    std::cout<<endl;

    mini.push(5);
    mini.push(9);
    mini.push(10);
    mini.push(1);
    int m=mini.size();
    for(int i=0;i<m;i++){
        std::cout<<mini.top()<<" ";
        mini.pop();
    }
    std::cout<<endl;


    
}