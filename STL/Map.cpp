/*
Maps are associative containers that store elements in a mapped fashion. 
Each element has a key value and a mapped value. No two mapped values can have the same key values.
*/

#include <iostream>
#include <map>

using namespace std;
int main(){
    map<int,string> m;
    m[1]="hii";
    m[3]="hello";
    m[5]="anjali";
    m.insert({2,"yoo"});

    for(auto i:m){
        cout<<i.first<<" "<<i.second<<" ";
    }cout<<endl;

    //check whether ele present or not
    cout<<"find 5->"<<m.count(5)<<endl;

    m.erase(5);
    for(auto i:m){
        cout<<i.first<<" "<<endl;
    }
}