/*They are similar to vectors, but are more efficient in case of insertion and deletion of elements.
 Unlike vectors, contiguous storage allocation may not be guaranteed. 
 Double-ended queues are a special case of queues where insertion and deletion operations are possible at both the ends.
 The time complexities for doing various operations on deques are-

Accessing Elements- O(1)
Insertion or removal of elements- O(N)
Insertion or removal of elements at start or end- O(1)*/

#include <iostream>
#include <deque>
using namespace std;
int main(){
    deque<int> d;

    d.push_back(1);
    d.push_back(2);
    d.push_front(3);

    for(int i: d){
        cout<<i<<" ";
    }
    cout<<endl;

    // delete front ele
    d.pop_front();
    for(int i: d){
        cout<<i<<" ";
    }
    cout<<endl;

    cout<<"Print ist ele: "<<d.at(1) ; cout<<endl;
    
    cout<<"Front: "<< d.front()<<endl;
    cout<<"Back: "<< d.back()<<endl;

    cout<<"Empty or Not: "<<d.empty()<<endl;

    cout<<"Before Erase size: "<<d.size()<<endl;
    //have to specify the range
    d.erase(d.begin(),d.begin()+1);
    cout<<"After Erase: "<<d.size()<<endl;
    


}
