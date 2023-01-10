#include <iostream>
#include <vector>
using namespace std;
int main(){
    // Dynamic allocation
    //vector <int> *vp= new vector <int>();
    //Static allocation
    vector <int> v;

    for(int i=0;i<30;i++){
        cout << "cap :" << v.capacity()<< endl;
        cout << "size :" << v.size() << endl;
        v.push_back(i+1);
    }
    //insertion of ele
    v.push_back(10);
    v.push_back(20);
    v.push_back(30);

    v[1]=100;
    v[3]=1002;
    v[4]=1234;

    v.push_back(23);
    v.push_back(245);

    //print
    cout<< v[0]<< endl;
    cout<< v[1]<< endl;
    cout<< v[2]<< endl;
    cout<< v[3]<< endl;
    cout<< v[4]<< endl;
    cout<< v[5]<< endl;
    cout<< v[6]<< endl;

    /*
    for (int i=0; i<v.size(); i++){
        cout << v[i] << endl;
    }
    */
    cout<<"Size: " <<v.size() << endl;
    cout<< v.at(2) << endl;
    cout<< v.at(6) <<endl;
}