// Vectors are dynamic i.e their size can be changed, vectors always get space in the 
//heap section of the memory whereas array size is fixed.

//when we add extra ele as input it doubles its size:
//But how is it possible? vector takes new vector of double its size when an extra input is taken and discard the previous one
 
 #include <iostream>
 #include <vector>
 using namespace std;
 int main(){
    vector <int> v;
    cout<<"Capacity: "<<v.capacity()<<endl;

    v.push_back(1);
    cout<<"Capacity: "<<v.capacity()<<endl;

    v.push_back(2);
    cout<<"Capacity: "<<v.capacity()<<endl;

    v.push_back(3);
    cout<<"Capacity: "<<v.capacity()<<endl;
    cout<<"Size: "<<v.size()<<endl;

    cout<<"Ele at 2 index: "<<v.at(2)<<endl;

    cout<<"Front: "<< v.front()<<endl;
    cout<<"Back: "<< v.back()<<endl;

    cout<<"Before POP: "<<endl;
    for(int i:v){
        cout<<i<<" ";
    }cout<<endl;

    v.pop_back();
    cout<<"After POP: "<<endl;
    for(int i:v){
        cout<<i<<" ";
    }cout<<endl;

    //capacity remain same only size become zero;
    cout<<"Before clear size: "<<v.size()<<endl;
    v.clear();
    cout<<"After clear size: "<<v.size()<<endl;
    
 }