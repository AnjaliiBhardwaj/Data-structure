/*
Stores Unique elements ,and ordered set return in sorted order*/

#include <iostream>
#include <set>

using namespace std;
int main(){
    set<int> s;

    s.insert(5);
    s.insert(9);
    s.insert(5);
    s.insert(3);
    s.insert(6);

    for(auto i: s){
        std::cout<<i<<endl;
    }std::cout<<endl;

    set<int>::iterator it =s.begin();
    it++;

    s.erase(s.begin());

    for(auto i:s){
        std::cout<<i<<endl;
    }

    std::cout<<"5 is present or not-> "<<s.count(5)<<endl;
    
    //to count 5
    set<int> :: iterator itr =s.find(5);

    for(auto it=itr;it!=s.end();it++){
        std::cout<<*it<<" ";
    }std::cout<<endl;

}